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

CustomKeywords.'domain1.Page_MainPage.goToLogInPage'()

CustomKeywords.'domain1.Page_LogInPage.logIn'('John Doe', 'ThisIsNotAPassword')

'Case 1: empty date'
CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', '', '')

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'domain1.NavigationBar.goToPage'('home')

'Case 2: string date'
CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', 'stringdate', '')

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'domain1.NavigationBar.goToPage'('home')

'Case 3: Special character date'
CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', '~!@#%^&*()', '')

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'domain1.NavigationBar.goToPage'('home')

'Case 4: Date in wrong format 23/07/23'
CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', '23/07/23', '')

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'domain1.NavigationBar.goToPage'('home')

'Case 5: Date earlier than today'
CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', '07/09/2022', '')

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment)

CustomKeywords.'domain1.NavigationBar.goToPage'('home')

WebUI.closeBrowser()

