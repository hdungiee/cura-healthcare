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

WebUI.click(findTestObject('Page_Make Appointment/button_Book Appointment'))

WebUI.verifyElementHasAttribute(findTestObject('Page_Make Appointment/input_Visit Date (Required)_visit_date'), 'required', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Page_Make Appointment/input_Visit Date (Required)_visit_date'), 'autocomplete',
	'off', 0)

def invalidDates = ['', 'stringDate', '!@#$%^&*()', '07/23/2023', '07/07/23']

for (def date : invalidDates) {
	
	CustomKeywords.'makeAppointment.MakeAppointment.fillOutForm'('Tokyo CURA Healthcare Center', 'Yes', 'Medicare', date, 'Random commens...')
	
	url = WebUI.getUrl()
	
	WebUI.verifyEqual(url, GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)
}

