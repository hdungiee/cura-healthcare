package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Page_AppointmentPage {

	static def selectFacility(String facility) {
		if (facility != '') {
			WebUI.selectOptionByLabel(findTestObject('Page_AppointmentPage/Dropdown_Facility'), facility, true)

			return facility
		}
		return facility = GlobalVariable.facility_default
	}

	static def selectHospitalReadmission(String readmission) {
		if (readmission == "Yes"){
			WebUI.check(findTestObject('Page_AppointmentPage/CheckBox_Apply for readmission'))

			return readmission
		}
		return readmission = GlobalVariable.readmission_default
	}

	static def selectProgram(String program) {
		if (program != '') {
			WebUI.check(findTestObject('Page_AppointmentPage/radio_Programs', [('program') : program.toLowerCase()]))

			return program
		}
		return program = GlobalVariable.program_default
	}

	static def selectDate(String date) {
		WebUI.setText(findTestObject('Page_AppointmentPage/input_Visit Date (Required)_visit_date'), date)

		return date
	}

	static def addComment(String comment) {
		WebUI.setText(findTestObject('Page_AppointmentPage/textarea_Comment_comment'), comment)

		return comment
	}

	static def clickSubmitButton() {
		WebUI.click(findTestObject('Page_AppointmentPage/button_Book Appointment'))
	}
}
