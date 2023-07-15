package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import java.util.List as List
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

public class Page_HistoryPage {

	static def verifyCorrectHistory(List form_output) {

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Headings'), form_output[3])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'facility']), form_output[0])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'hospital_readmission']), form_output[
			1])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'program']), form_output[2])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'comment']), form_output[4])
	}

	static def verifyCorrectHistoryCard(Integer index, List form_output){

		WebDriver driver = DriverFactory.getWebDriver()

		def headings = driver.findElements(By.className('panel-heading'))

		def facility_sum = driver.findElements(By.id('facility'))

		def readmission_sum = driver.findElements(By.id('hospital_readmission'))

		def program_sum = driver.findElements(By.id('program'))

		def comment_sum = driver.findElements(By.id('comment'))

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(headings[index]), form_output[3])

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(facility_sum[index]), form_output[0])

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(readmission_sum[index]), form_output[1])

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(program_sum[index]), form_output[2])

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(comment_sum[index]), form_output[4])
	}
}
