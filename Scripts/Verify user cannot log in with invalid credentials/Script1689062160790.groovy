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

'Case 1: no username, no password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('', '')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 2: no username, right password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('', 'ThisIsNotAPassword')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 3: right username, no password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('John Doe', '')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 4: wrong username, wrong password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('JohnDoe', 'WrongPassword')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 5: right username, wrong password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('John Doe', 'WrongPassword')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 6: wrong username, right password'
CustomKeywords.'domain1.Page_LogInPage.logIn'('JohnDoe', 'ThisIsNotAPassword')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

'Case 7: special character'
CustomKeywords.'domain1.Page_LogInPage.logIn'('!@#%^&*()_+', '~!@#%^&*()_+')

CustomKeywords.'domain1.Page_LogInPage.verifyLogInUnsuccessfully'()

WebUI.closeBrowser()

