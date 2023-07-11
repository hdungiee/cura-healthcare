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

WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))

CustomKeywords.'logIn.LogIn.logIn'('John Doe', 'ThisIsNotAPassword')

'Fill out form'
form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'(facility, readmission, program, date, comment)

url = WebUI.getUrl()

'Verify correct URL and summary information'
WebUI.verifyEqual(url, GlobalVariable.URL_summary)

WebUI.verifyElementText(findTestObject('Page_Summary/Summary lines', [('id') : 'facility']), form_output[0])

WebUI.verifyElementText(findTestObject('Page_Summary/Summary lines', [('id') : 'hospital_readmission']), form_output[1])

WebUI.verifyElementText(findTestObject('Page_Summary/Summary lines', [('id') : 'program']), form_output[2])

WebUI.verifyElementText(findTestObject('Page_Summary/Summary lines', [('id') : 'visit_date']), form_output[3])

WebUI.verifyElementText(findTestObject('Page_Summary/Summary lines', [('id') : 'comment']), form_output[4])

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.click(findTestObject('Navigation Bar/Buttons', [('index') : '3']))

'Go to History page'
//WebUI.verifyEqual(url, GlobalVariable.URL_history)

WebUI.verifyElementText(findTestObject('Page_History page/Headings'), form_output[3])

WebUI.verifyElementText(findTestObject('Page_History page/Summary lines', [('id') : 'facility']), form_output[0])

WebUI.verifyElementText(findTestObject('Page_History page/Summary lines', [('id') : 'hospital_readmission']), form_output[
    1])

WebUI.verifyElementText(findTestObject('Page_History page/Summary lines', [('id') : 'program']), form_output[2])

WebUI.verifyElementText(findTestObject('Page_History page/Summary lines', [('id') : 'comment']), form_output[4])

WebUI.closeBrowser()

