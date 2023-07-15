import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_homepage)

Page_MainPage.goToLogInPage()

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

'Book apointment 1'

Page_AppointmentPage.resetFormValue()

Page_AppointmentPage.selectHospitalReadmission('Yes')
Page_AppointmentPage.selectProgram('None')
Page_AppointmentPage.selectDate('08/06/2023')
Page_AppointmentPage.clickSubmitButton()

form_output1 = Page_AppointmentPage.getAppointmentFormValue()

Page_SummaryPage.goToHomepage()

'Book apointment 2'

Page_AppointmentPage.resetFormValue()

Page_AppointmentPage.selectFacility('Seoul CURA Healthcare Center')
Page_AppointmentPage.selectDate('09/12/2024')
Page_AppointmentPage.addComment('comment')
Page_AppointmentPage.clickSubmitButton()

form_output2 = Page_AppointmentPage.getAppointmentFormValue()

Page_SummaryPage.goToHomepage()

'Book apointment 3'

Page_AppointmentPage.resetFormValue()

Page_AppointmentPage.selectDate('22/03/2021')
Page_AppointmentPage.clickSubmitButton()

form_output3 = Page_AppointmentPage.getAppointmentFormValue()

'Go to History page'

NavigationBar.goToPage('History')

'Verify correct history cards'

Page_HistoryPage.verifyCorrectHistoryCard(0, form_output1)

Page_HistoryPage.verifyCorrectHistoryCard(1, form_output2)

Page_HistoryPage.verifyCorrectHistoryCard(2, form_output3)

WebUI.closeBrowser()

