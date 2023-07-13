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

public class NavigationBar {
	@Keyword
	def goToPage(String page) {
		def index = 0
		if (page.toLowerCase() == 'home') {
			index = 2
		}
		else if (page.toLowerCase() == 'login') {
			index = 3
		}
		else if (page.toLowerCase() == 'history') {
			index = 3
		}
		else if (page.toLowerCase() == 'profile') {
			index = 4
		}
		else {
			index = 5
		}

		WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
		WebUI.click(findTestObject('Navigation Bar/Buttons', [('index') : index]))
	}
}
