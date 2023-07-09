package makeAppointment

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MakeAppointment {

	@Keyword(keywordObject = "Browser")

	def static fillOutForm(String facility, String readmission, String program, String date, String comment) {
		WebUI.selectOptionByLabel(findTestObject('Page_Make Appointment/Dropdown_Facility'), facility, true)

		if (readmission == 'Yes') {
			WebUI.check(findTestObject('Page_Make Appointment/CheckBox_Apply for readmission'))
		}

		switch (program) {

			case 'Medicare':
				WebUI.check(findTestObject('Page_Make Appointment/input_Medicare_programs'))

				WebUI.verifyElementChecked(findTestObject('Page_Make Appointment/input_Medicare_programs'), 0)

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_Medicaid_programs'), 0)

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_None_programs'), 0)

				break
			case 'Medicaid':
				WebUI.check(findTestObject('Page_Make Appointment/input_Medicaid_programs'))

				WebUI.verifyElementChecked(findTestObject('Page_Make Appointment/input_Medicaid_programs'), 0)

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_Medicare_programs'), 0)

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_None_programs'), 0)

				break
			case 'None':
				WebUI.check(findTestObject('Page_Make Appointment/input_None_programs'))

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_Medicaid_programs'), 0)

				WebUI.verifyElementNotChecked(findTestObject('Page_Make Appointment/input_Medicare_programs'), 0)

				WebUI.verifyElementChecked(findTestObject('Page_Make Appointment/input_None_programs'), 0)

				break
		}

		WebUI.setText(findTestObject('Page_Make Appointment/input_Visit Date (Required)_visit_date'), date)

		WebUI.setText(findTestObject('Page_Make Appointment/textarea_Comment_comment'), comment)

		WebUI.click(findTestObject('Page_Make Appointment/button_Book Appointment'))
	}

	@Keyword

	def fillOutFormByRow(Integer index) {

		TestData data = findTestData('Verify Successful Appointment')

		def String facility = data.getValue(1,index)
		def String readmission = data.getValue(2, index)
		def String program = data.getValue(3, index)
		def String date = data.getValue(4, index)
		def String comment = data.getValue(5, index)

		MakeAppointment.fillOutForm(facility, readmission, program, date, comment)

		return [
			facility,
			readmission,
			program,
			date,
			comment
		]
	}
}
