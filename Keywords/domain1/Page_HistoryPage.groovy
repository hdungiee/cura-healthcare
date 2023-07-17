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

	static def verifyCorrectHistory(String facility, String readmission, String program, String date, String comment) {

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Headings'), date)

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'facility']), facility)

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'hospital_readmission']), readmission)

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'program']), program)

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'comment']), comment)
	}

	static def verifyCorrectHistoryCard(Integer index, String facility, String readmission, String program, String date, String comment){

		WebDriver driver = DriverFactory.getWebDriver()

		def headings = driver.findElements(By.className('panel-heading'))

		def facility_sum = driver.findElements(By.id('facility'))

		def readmission_sum = driver.findElements(By.id('hospital_readmission'))

		def program_sum = driver.findElements(By.id('program'))

		def comment_sum = driver.findElements(By.id('comment'))

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(headings[index]), date)

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(facility_sum[index]), facility)

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(readmission_sum[index]), readmission)

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(program_sum[index]), program)

		WebUI.verifyElementText(WebUI.convertWebElementToTestObject(comment_sum[index]), comment)
	}
}
