package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Page_LogInPage {
	@Keyword
	def logIn(username, password) {
		WebUI.setText(findTestObject('Page_LogInPage/InputFields', [('id') : 'username']), username)
		WebUI.setText(findTestObject('Page_LogInPage/InputFields', [('id') : 'password']), password)
		WebUI.click(findTestObject('Page_LogInPage/Button_Log in'))
	}

	@Keyword
	def verifyLogInSuccessfully() {
		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment)
		WebUI.verifyElementVisible(findTestObject('Page_AppointmentPage/Dropdown_Facility'))
	}

	@Keyword
	def verifyLogInUnsuccessfully() {
		WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_login)
		WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
	}
}
