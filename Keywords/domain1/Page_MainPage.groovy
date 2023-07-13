package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class Page_MainPage {
	@Keyword
	def goToLogInPage() {
		WebUI.click(findTestObject('Page_MainPage/Button_MakeAppointment'))
	}

	@Keyword
	def verifySuccessfulLogOut() {

		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_homepage)

		def main_page = new Page_MainPage()

		main_page.goToLogInPage()

		WebUI.verifyTextPresent('Please login to make appointment.', false)
	}
}
