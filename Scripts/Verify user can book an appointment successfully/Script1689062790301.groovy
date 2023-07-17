import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import domain1.*
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser(GlobalVariable.URL_homepage)

WebUI.setViewPortSize(2400, 1282)

WebUI.takeScreenshotAsCheckpoint('home_page')

Page_MainPage.goToLogInPage()

WebUI.takeScreenshotAsCheckpoint('login_page')

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

'Fill out form'
facility_value = Page_AppointmentPage.selectFacility(facility)

readmission_value = Page_AppointmentPage.selectHospitalReadmission(readmission)

program_value = Page_AppointmentPage.selectProgram(program)

date_value = Page_AppointmentPage.selectDate(date)

comment_value = Page_AppointmentPage.addComment(comment)

Page_AppointmentPage.clickSubmitButton()

WebUI.takeFullPageScreenshotAsCheckpoint('summary_page.')

Page_SummaryPage.verifyCorrectSummary(facility_value, readmission_value, program_value, date_value, comment_value)

NavigationBar.goToPage('History')

WebUI.takeScreenshotAsCheckpoint('history_page')

Page_HistoryPage.verifyCorrectHistory(facility_value, readmission_value, program_value, date_value, comment_value)

WebUI.closeBrowser()

