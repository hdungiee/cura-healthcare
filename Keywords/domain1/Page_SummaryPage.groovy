package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Page_SummaryPage {

	static def facility_default = "Tokyo CURA Healthcare Center"
	static def readmission_default = "No"
	static def program_default = "Medicare"
	static def comment_default = ""

	//	static def verifyCorrectSummary(String facility = facility_default, String readmission = readmission_default, String program = program_default, String date, String comment = comment_default) {
	static def verifyCorrectSummary(String facility, String readmission, String program, String date, String comment) {

		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_summary)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'facility']), facility)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'hospital_readmission']), readmission)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'program']), program)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'visit_date']), date)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'comment']), comment)
	}

	static def goToHomepage() {
		WebUI.click(findTestObject('Page_SummaryPage/Button_Go to Homepage'))
	}
}
