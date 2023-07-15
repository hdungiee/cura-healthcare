package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Page_SummaryPage {

	static def verifyCorrectSummary(List form_output) {

		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_summary)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'facility']), form_output[0])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'hospital_readmission']), form_output[1])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'program']), form_output[2])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'visit_date']), form_output[3])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'comment']), form_output[4])
	}

	static def goToHomepage() {
		WebUI.click(findTestObject('Page_SummaryPage/Button_Go to Homepage'))
	}
}
