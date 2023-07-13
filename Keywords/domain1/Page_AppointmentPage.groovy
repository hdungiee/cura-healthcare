package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Page_AppointmentPage {

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
