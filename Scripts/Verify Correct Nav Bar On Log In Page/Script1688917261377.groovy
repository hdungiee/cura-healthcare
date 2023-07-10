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

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_homepage)

WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_login)

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Active Navigation Bar'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Button_Home'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Button_LogIn'))

WebUI.verifyElementNotVisible(findTestObject('Navigation Bar/Button_Logout'))

WebUI.verifyElementNotVisible(findTestObject('Navigation Bar/Button_History'))

WebUI.verifyElementNotVisible(findTestObject('Navigation Bar/Button_Profile'))

WebUI.click(findTestObject('Navigation Bar/Button_Home'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_homepage)

WebUI.back()

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_homepage)

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.click(findTestObject('Navigation Bar/Button_LogIn'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_login)

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Active Navigation Bar'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Button_Home'))

WebUI.verifyElementVisible(findTestObject('Navigation Bar/Button_LogIn'))

WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_Logout'), 0)

WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_History'), 0)

WebUI.verifyElementNotPresent(findTestObject('Navigation Bar/Button_Profile'), 0)

WebUI.click(findTestObject('Navigation Bar/Button_Home'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_homepage)

WebUI.back()

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_login)

WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.click(findTestObject('Navigation Bar/Button_LogIn'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, GlobalVariable.URL_login)

