import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import domain1.*
import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.URL_homepage)

Page_MainPage.goToLogInPage()

Page_LogInPage.logIn('John Doe', 'ThisIsNotAPassword')

'Book apointment 1'

readmission1 = Page_AppointmentPage.selectHospitalReadmission('Yes')
program1 = Page_AppointmentPage.selectProgram('None')
date1 = Page_AppointmentPage.selectDate('08/06/2023')

Page_AppointmentPage.clickSubmitButton()

Page_SummaryPage.goToHomepage()

'Book apointment 2'

facility2 = Page_AppointmentPage.selectFacility('Seoul CURA Healthcare Center')
date2 = Page_AppointmentPage.selectDate('09/12/2024')
comment2 = Page_AppointmentPage.addComment('comment')

Page_AppointmentPage.clickSubmitButton()

Page_SummaryPage.goToHomepage()

'Book apointment 3'

date3 = Page_AppointmentPage.selectDate('22/03/2021')
Page_AppointmentPage.clickSubmitButton()

'Go to History page'

NavigationBar.goToPage('History')

'Verify correct history cards'

Page_HistoryPage.verifyCorrectHistoryCard(0, GlobalVariable.facility_default, readmission1, program1, date1, GlobalVariable.comment_default)

Page_HistoryPage.verifyCorrectHistoryCard(1, facility2, GlobalVariable.readmission_default, GlobalVariable.program_default, date2, comment2)

Page_HistoryPage.verifyCorrectHistoryCard(2, GlobalVariable.facility_default, GlobalVariable.readmission_default, GlobalVariable.program_default, date3, GlobalVariable.comment_default)

WebUI.closeBrowser()

