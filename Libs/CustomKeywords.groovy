
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.util.List

import java.lang.String



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
