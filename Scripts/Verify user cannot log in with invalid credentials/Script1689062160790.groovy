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

'Case 1: no username, no password'
CustomKeywords.'logIn.LogIn.logIn'('', '')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 2: no username, right password'
CustomKeywords.'logIn.LogIn.logIn'('', 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 3: right username, no password'
CustomKeywords.'logIn.LogIn.logIn'('John Doe', '')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 4: wrong username, wrong password'
CustomKeywords.'logIn.LogIn.logIn'('JohnDoe', 'WrongPassword')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 5: right username, wrong password'
CustomKeywords.'logIn.LogIn.logIn'('John Doe', 'WrongPassword')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 6: wrong username, right password'
CustomKeywords.'logIn.LogIn.logIn'('JohnDoe', 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

'Case 7: special character'
CustomKeywords.'logIn.LogIn.logIn'('!@#%^&*()_+', '~!@#%^&*()_+')

WebUI.click(findTestObject('Page_Log in page/Button_Log in'))

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)

WebUI.closeBrowser()

