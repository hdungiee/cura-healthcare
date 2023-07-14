import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_homepage)

Page_MainPage.goToLogInPage()

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

Page_LogInPage.verifyLogInSuccessfully()

WebUI.closeBrowser()

