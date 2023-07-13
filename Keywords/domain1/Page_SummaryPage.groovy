package domain1

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

public class Page_SummaryPage {

	@Keyword
	def verifyCorrectSummary(List form_output) {

		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_summary)

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'facility']), form_output[0])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'hospital_readmission']), form_output[1])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'program']), form_output[2])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'visit_date']), form_output[3])

		WebUI.verifyElementText(findTestObject('Page_SummaryPage/p_Summary', [('id') : 'comment']), form_output[4])
	}

	@Keyword
	def goToHomepage() {
		WebUI.click(findTestObject('Page_SummaryPage/Button_Go to Homepage'))
	}
}
