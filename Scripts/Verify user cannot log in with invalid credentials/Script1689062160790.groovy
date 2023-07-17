import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.URL_homepage)

def main_page = new Page_MainPage()

main_page.goToLogInPage()

def login_page = new Page_LogInPage()

login_page.logIn(username, password)

login_page.verifyLogInUnsuccessfully()

WebUI.closeBrowser()

