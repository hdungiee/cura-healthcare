import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_homepage)

Page_MainPage.goToLogInPage()

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

'Fill out form'
Page_AppointmentPage.resetFormValue()

Page_AppointmentPage.selectFacility(facility)

Page_AppointmentPage.selectHospitalReadmission(readmission)

Page_AppointmentPage.selectProgram(program)

Page_AppointmentPage.selectDate(date)

Page_AppointmentPage.addComment(comment)

form_output = Page_AppointmentPage.getAppointmentFormValue()

Page_AppointmentPage.clickSubmitButton()

Page_SummaryPage.verifyCorrectSummary(form_output)

NavigationBar.goToPage('History')

Page_HistoryPage.verifyCorrectHistory(form_output)

WebUI.closeBrowser()

