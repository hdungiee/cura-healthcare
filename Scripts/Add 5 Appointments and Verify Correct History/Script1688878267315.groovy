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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.util.List as List

WebUI.callTestCase(findTestCase('Verify Successful Log In'), [:], FailureHandling.STOP_ON_FAILURE)

def panel_info = []

for (def index : (1..5)) {
	
    form_output = CustomKeywords.'makeAppointment.MakeAppointment.fillOutFormByRow'(index)

    panel_info.add(form_output)

    CustomKeywords.'navigationBar.NavigationBar.goToHistory'()

    WebDriver driver = DriverFactory.getWebDriver()

    List headings = driver.findElements(By.className('panel-heading'))
	
	System.out.println(headings.size())
	System.out.println(headings)

    List facilities = driver.findElements(By.id('facility'))
	
	List readmissions = driver.findElements(By.id('hospital-readmission'))
	
	List programs = driver.findElements(By.id('program'))
	
	List comments = driver.findElements(By.id('comment'))
	
	for (def i : (0..(index-1))) {
		
		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(headings[i]), panel_info[i][3])
		
		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(facilities[i]), panel_info[i][0])
		
//		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(readmissions[-i]), panel_info[i][1])
		
		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(programs[i]), panel_info[i][2])
		
		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(comments[i]), panel_info[i][4])
	}
	
    
    CustomKeywords.'navigationBar.NavigationBar.goToHome'()
}

