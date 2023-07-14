
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.List



def static "domain1.Page_LogInPage.logIn"(
    	Object username	
     , 	Object password	) {
    (new domain1.Page_LogInPage()).logIn(
        	username
         , 	password)
}


def static "domain1.Page_LogInPage.verifyLogInSuccessfully"() {
    (new domain1.Page_LogInPage()).verifyLogInSuccessfully()
}


def static "domain1.Page_LogInPage.verifyLogInUnsuccessfully"() {
    (new domain1.Page_LogInPage()).verifyLogInUnsuccessfully()
}


def static "domain1.NavigationBar.goToPage"(
    	String page	) {
    (new domain1.NavigationBar()).goToPage(
        	page)
}


def static "domain1.Page_HistoryPage.verifyCorrectHistory"(
    	List form_output	) {
    (new domain1.Page_HistoryPage()).verifyCorrectHistory(
        	form_output)
}


def static "domain1.Page_HistoryPage.verifyCorrectHistoryOf3Appointments"(
    	List form_output1	
     , 	List form_output2	
     , 	List form_output3	) {
    (new domain1.Page_HistoryPage()).verifyCorrectHistoryOf3Appointments(
        	form_output1
         , 	form_output2
         , 	form_output3)
}


def static "domain1.Page_SummaryPage.verifyCorrectSummary"(
    	List form_output	) {
    (new domain1.Page_SummaryPage()).verifyCorrectSummary(
        	form_output)
}


def static "domain1.Page_SummaryPage.goToHomepage"() {
    (new domain1.Page_SummaryPage()).goToHomepage()
}


def static "domain1.Page_AppointmentPage.fillAppointmentForm"(
    	String facility	
     , 	String readmission	
     , 	String program	
     , 	String date	
     , 	String comment	) {
    (new domain1.Page_AppointmentPage()).fillAppointmentForm(
        	facility
         , 	readmission
         , 	program
         , 	date
         , 	comment)
}
