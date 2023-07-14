package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Page_AppointmentPage {

	static def facility_value = 'Tokyo CURA Healthcare Center'
	static def readmission_value = 'No'
	static def program_value = 'Medicare'
	static def comment_value
	static def date_value

	static def info_list


	static def selectFacility(String facility) {
		WebUI.selectOptionByLabel(findTestObject('Page_AppointmentPage/Dropdown_Facility'), facility, true)
		facility_value = facility
	}

	static def selectHospitalReadmission(String readmission) {
		if (readmission == "Yes"){
			WebUI.check(findTestObject('Page_AppointmentPage/CheckBox_Apply for readmission'))
		}

		readmission_value = readmission
	}

	static def selectProgram(String program) {
		WebUI.check(findTestObject('Page_AppointmentPage/radio_Programs', [('program') : program.toLowerCase()]))

		program_value = program
	}

	static def selectDate(String date) {
		WebUI.setText(findTestObject('Page_AppointmentPage/input_Visit Date (Required)_visit_date'), date)

		date_value = date
	}

	static def addComment(String comment) {
		WebUI.setText(findTestObject('Page_AppointmentPage/textarea_Comment_comment'), comment)

		comment_value = comment
	}

	static def clickSubmitButton() {
		WebUI.click(findTestObject('Page_AppointmentPage/button_Book Appointment'))
	}

	static def getAppointmentFormValue() {
		return [facility_value, readmission_value, program_value, date_value, comment_value]
	}

	@Keyword
	def fillAppointmentForm(String facility, String readmission, String program, String date, String comment) {

		if (facility != "") {
			WebUI.selectOptionByLabel(findTestObject('Page_AppointmentPage/Dropdown_Facility'), facility, true)
		}
		else {
			facility = "Tokyo CURA Healthcare Center"
		}

		if (readmission == 'Yes') {
			WebUI.check(findTestObject('Page_AppointmentPage/CheckBox_Apply for readmission'))
		}
		else {
			readmission = "No"
		}

		if (program != "") {
			WebUI.check(findTestObject('Page_AppointmentPage/radio_Programs', [('program') : program.toLowerCase()]))
		}
		else {
			program = "Medicare"
		}

		WebUI.setText(findTestObject('Page_AppointmentPage/input_Visit Date (Required)_visit_date'), date)

		WebUI.setText(findTestObject('Page_AppointmentPage/textarea_Comment_comment'), comment)

		WebUI.click(findTestObject('Page_AppointmentPage/button_Book Appointment'))


		return [
			facility,
			readmission,
			program,
			date,
			comment
		]
	}
}
