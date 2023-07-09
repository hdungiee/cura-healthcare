import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_homepage)

def pages = [GlobalVariable.URL_homepage, GlobalVariable.URL_login, GlobalVariable.URL_profile, GlobalVariable.URL_history
	, GlobalVariable.URL_appointment]

def btn_home = 'Navigation Bar/Button_Home'
def btn_history = 'Navigation Bar/Button_Home'
def btn_profile = 'Navigation Bar/button_Profile'
def btn_logout = 'Navigation Bar/Button_Logout'

for (def page : pages) {
	
	'Verify navigated to the right URL'
	url = WebUI.getUrl()

	WebUI.verifyEqual(url, page)

	'Verify button clickable in each page'
	WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
	
	switch (page) {
	
		case GlobalVariable.URL_homepage:
		
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			WebUI.click(findTestObject('Navigation Bar/Button_Home'))
			def url = WebUI.getUrl()
			WebUI.verifyEqual(url, GlobalVariable.URL_homepage)
			
			WebUI.back()
			
			WebUI.click(findTestObject('Navigation Bar/Button_Home'))
			def url = WebUI.getUrl()
			WebUI.verifyEqual(url, GlobalVariable.URL_homepage)
			
			'Verify button nav bar closed'
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
			WebUI.verifyElementAttributeValue(findTestObject('Navigation Bar/Active Navigation Bar'), 'class', '', 0)
			
			'Go to log in page'
			WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))
		
		case GlobalVariable.URL_login:
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			'Verify button nav bar closed'
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
			WebUI.verifyElementAttributeValue(findTestObject('Navigation Bar/Active Navigation Bar'), 'class', '', 0)
			
			'Go to appointment page'
			WebUI.callTestCase(findTestCase('Verify Successful Log In'), [:], FailureHandling.STOP_ON_FAILURE)
		
		case GlobalVariable.URL_login:
		
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			'Verify button nav bar closed'
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
			WebUI.verifyElementAttributeValue(findTestObject('Navigation Bar/Active Navigation Bar'), 'class', '', 0)
		
			'Go to summary page'
			CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('Tokyo CURA Healthcare Center', 'Yes', 'Medicaid', '07/07/2023', 'N/A')
		
		case GlobalVariable.URL_appointment:
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			'Go to history page'
			CustomKeywords.'navigationBar.NavigationBar.goToHistory'()
		
		case GlobalVariable.URL_history:
			
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			'Go to profile page'
			CustomKeywords.'navigationBar.NavigationBar.goToProfile'()
		
		case GlobalVariable.URL_profile:
			
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
			
			'Log out'
			CustomKeywords.'navigationBar.NavigationBar.logOut'()
			
			url = WebUI.getUrl()
			
			WebUI.verifyEqual(url, GlobalVariable.URL_homepage)
			
			'Verify button clickable in each page'
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
		
			'Verify correct buttons in the Nav Bar on the page: '
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Home'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Navigation Bar/Button_Logout'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_Profile'), 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_History'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}

