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

WebUI.click(findTestObject('Page_Main page/Button_Make Appointment'))

CustomKeywords.'logIn.LogIn.logIn'('John Doe', 'ThisIsNotAPassword')

facility_list = []

readmission_list = []

program_list = []

dates_list = []

comment_list = []

'Fill out form'
form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('Seoul CURA Healthcare Center', 'No', '', 
    '08/08/2023', '')

facility_list.add(form_output[0])

readmission_list.add(form_output[1])

program_list.add(form_output[2])

dates_list.add(form_output[3])

comment_list.add(form_output[4])

WebUI.click(findTestObject('Page_Summary/Button_Go to Homepage'))

'Fill out form'
form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('Seoul CURA Healthcare Center', 'No', '', '08/09/2024', 
    '')

facility_list.add(form_output[0])

readmission_list.add(form_output[1])

program_list.add(form_output[2])

dates_list.add(form_output[3])

comment_list.add(form_output[4])

WebUI.click(findTestObject('Page_Summary/Button_Go to Homepage'))

'Fill out form'
form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('', '', '', '01/02/2023', 'comment')

facility_list.add(form_output[0])

readmission_list.add(form_output[1])

program_list.add(form_output[2])

dates_list.add(form_output[3])

comment_list.add(form_output[4])

'Go to History page'
WebUI.click(findTestObject('Navigation Bar/Icon_Menu'))

WebUI.click(findTestObject('Navigation Bar/Buttons', [('index') : '3']))

WebDriver driver = DriverFactory.getWebDriver()

def headings = driver.findElements(By.className('panel-heading'))

def facility_sum = driver.findElements(By.id('facility'))

def readmission_sum = driver.findElements(By.id('hospital_readmission'))

def program_sum = driver.findElements(By.id('program'))

def comment_sum = driver.findElements(By.id('comment'))

for (def index : (0..2)) {
    WebUI.verifyElementText(WebUI.convertWebElementToTestObject(headings[index]), dates_list[index])

    WebUI.verifyElementText(WebUI.convertWebElementToTestObject(facility_sum[index]), facility_list[index])

    WebUI.verifyElementText(WebUI.convertWebElementToTestObject(readmission_sum[index]), readmission_list[index])

    WebUI.verifyElementText(WebUI.convertWebElementToTestObject(program_sum[index]), program_list[index])

    WebUI.verifyElementText(WebUI.convertWebElementToTestObject(comment_sum[index]), comment_list[index])
}

WebUI.closeBrowser()

