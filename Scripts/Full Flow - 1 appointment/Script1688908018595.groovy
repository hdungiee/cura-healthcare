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

WebUI.callTestCase(findTestCase('Verify Successful Log In'), [:], FailureHandling.STOP_ON_FAILURE)

def form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutFormByRow'(1)

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_summary)

WebUI.verifyTextPresent(form_output[0], false)

WebUI.verifyTextPresent(form_output[1], false)

WebUI.verifyTextPresent(form_output[2], false)

WebUI.verifyTextPresent(form_output[3], false)

WebUI.verifyTextPresent(form_output[4], false)

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.click(findTestObject('Navigation Bar/Button_Logout'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_homepage)

WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))

WebUI.verifyTextPresent('Please login to make appointment.', false)

