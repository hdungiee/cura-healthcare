import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.URL_homepage)

Page_MainPage.goToLogInPage()

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

'Case 1: empty date'

Page_AppointmentPage.selectDate('')

Page_AppointmentPage.clickSubmitButton()

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

NavigationBar.goToPage('Home')

'Case 2: string date'

Page_AppointmentPage.selectDate('stringdate')

Page_AppointmentPage.clickSubmitButton()

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

NavigationBar.goToPage('Home')

'Case 3: Special character date'

Page_AppointmentPage.selectDate('~!@#%^&*()')

Page_AppointmentPage.clickSubmitButton()

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

NavigationBar.goToPage('Home') 

'Case 4: Date in wrong format 23/07/23'

Page_AppointmentPage.selectDate('23/07/23')

Page_AppointmentPage.clickSubmitButton()

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

NavigationBar.goToPage('Home')

'Case 5: Date earlier than today'

Page_AppointmentPage.selectDate('09/07/2022')

Page_AppointmentPage.clickSubmitButton()

WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.URL_appointment, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

