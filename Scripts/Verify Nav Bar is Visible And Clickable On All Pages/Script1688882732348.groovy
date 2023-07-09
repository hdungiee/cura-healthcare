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

def pages = [GlobalVariable.URL_homepage, GlobalVariable.URL_login, GlobalVariable.URL_appointment, GlobalVariable.URL_history
    , GlobalVariable.URL_profile]

for (def page : pages) {
	
    'Verify navigated to the right URL'
    url = WebUI.getUrl()

    WebUI.verifyEqual(url, page)

    'Verify button clickable in each page'
    WebUI.verifyElementClickable(findTestObject('Navigation Bar/Icon_Menu'))

    'Verify button nav bar closed'
    WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
	
	WebUI.verifyElementAttributeValue(findTestObject('Navigation Bar/Active Navigation Bar'), 'class', 'active', 0)
	
	switch (page) {
	
		case GlobalVariable.URL_homepage:
			'Go to log in page'
			WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))
			
			break
		
		case GlobalVariable.URL_login:
			'Go to appointment page'
			WebUI.callTestCase(findTestCase('Verify Successful Log In'), [:], FailureHandling.STOP_ON_FAILURE)
			
			break
		
		case GlobalVariable.URL_login:
			'Go to summary page'
			CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('Tokyo CURA Healthcare Center', 'Yes', 'Medicaid', '07/07/2023', 'N/A')
			
			break
		
		case GlobalVariable.URL_appointment:
		
			WebUI.verifyElementClickable(findTestObject('Navigation Bar/Icon_Menu'))
			
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
			
			'Go to history page'
			CustomKeywords.'navigationBar.NavigationBar.goToHistory'()
			
			break
		
		case GlobalVariable.URL_history:
			WebUI.verifyElementClickable(findTestObject('Navigation Bar/Icon_Menu'))
			
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
		
			'Go to profile page'
			CustomKeywords.'navigationBar.NavigationBar.goToProfile'()
			
			break
		
		case GlobalVariable.URL_profile:
			WebUI.verifyElementClickable(findTestObject('Navigation Bar/Icon_Menu'))
			
			WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))
		
			'Log out'
			CustomKeywords.'navigationBar.NavigationBar.logOut'()
			
			url = WebUI.getUrl()
			
			WebUI.verifyEqual(url, GlobalVariable.URL_homepage)
			
			'Verify button clickable in each page'
			WebUI.verifyElementClickable(findTestObject('Navigation Bar/Icon_Menu'))
		
			'Verify button nav bar closed'
			WebUI.click(findTestObject('Navigation Bar/Icon_menu'))
			
			WebUI.verifyElementAttributeValue(findTestObject('Navigation Bar/Active Navigation Bar'), 'class', 'active', 0)
			
			break
	}
}

