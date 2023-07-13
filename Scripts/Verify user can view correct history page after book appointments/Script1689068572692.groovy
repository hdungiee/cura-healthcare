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
import org.openqa.selenium.WebDriver as WebDriver
import java.util.List as List
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_homepage)

CustomKeywords.'domain1.Page_MainPage.goToLogInPage'()

CustomKeywords.'domain1.Page_LogInPage.logIn'('John Doe', 'ThisIsNotAPassword')

'Fill out form'
form_output1 = CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', 'Yes', 'None', '08/06/2023', '')

WebUI.click(findTestObject('Page_SummaryPage/Button_Go to Homepage'))

'Fill out form'
form_output2 = CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('Seoul CURA Healthcare Center', 'No', '', 
    '09/12/2024', 'comment')

WebUI.click(findTestObject('Page_SummaryPage/Button_Go to Homepage'))

'Fill out form'
form_output3 = CustomKeywords.'domain1.Page_AppointmentPage.fillAppointmentForm'('', '', '', '22/03/2021', '')

CustomKeywords.'domain1.NavigationBar.goToPage'('history')

CustomKeywords.'domain1.Page_HistoryPage.verifyCorrectHistoryOf3Appointments'(form_output1, form_output2, form_output3)

WebUI.closeBrowser()

