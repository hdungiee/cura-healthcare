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

	@Keyword
	def verifyCorrectHistory(List form_output) {

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Headings'), form_output[3])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'facility']), form_output[0])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'hospital_readmission']), form_output[
			1])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'program']), form_output[2])

		WebUI.verifyElementText(findTestObject('Page_HistoryPage/Summary lines', [('id') : 'comment']), form_output[4])
	}

	@Keyword
	def verifyCorrectHistoryOf3Appointments(List form_output1, List form_output2, List form_output3){

		def facility_list = []
		def readmission_list = []
		def program_list = []
		def dates_list = []
		def comment_list = []

		'Add appointment info of 1st appointment'

		facility_list.add(form_output1[0])

		readmission_list.add(form_output1[1])

		program_list.add(form_output1[2])

		dates_list.add(form_output1[3])

		comment_list.add(form_output1[4])


		'Add appointment info of 2nd appointment'

		facility_list.add(form_output2[0])

		readmission_list.add(form_output2[1])

		program_list.add(form_output2[2])

		dates_list.add(form_output2[3])

		comment_list.add(form_output2[4])


		'Add appointment info of 3rd appointment'

		facility_list.add(form_output3[0])

		readmission_list.add(form_output3[1])

		program_list.add(form_output3[2])

		dates_list.add(form_output3[3])

		comment_list.add(form_output3[4])


		WebDriver driver = DriverFactory.getWebDriver()

		def headings = driver.findElements(By.className('panel-heading'))

		def facility_sum = driver.findElements(By.id('facility'))

		def readmission_sum = driver.findElements(By.id('hospital_readmission'))

		def program_sum = driver.findElements(By.id('program'))

		def comment_sum = driver.findElements(By.id('comment'))

		for (def card : (0..2)) {

			WebUI.verifyElementText(WebUI.convertWebElementToTestObject(headings[card]), dates_list[card])

			WebUI.verifyElementText(WebUI.convertWebElementToTestObject(facility_sum[card]), facility_list[card])

			WebUI.verifyElementText(WebUI.convertWebElementToTestObject(readmission_sum[card]), readmission_list[card])

			WebUI.verifyElementText(WebUI.convertWebElementToTestObject(program_sum[card]), program_list[card])

			WebUI.verifyElementText(WebUI.convertWebElementToTestObject(comment_sum[card]), comment_list[card])
		}
	}
}
