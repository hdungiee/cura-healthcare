
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "navigationBar.NavigationBar.goToHome"() {
    (new navigationBar.NavigationBar()).goToHome()
}


def static "navigationBar.NavigationBar.goToProfile"() {
    (new navigationBar.NavigationBar()).goToProfile()
}


def static "navigationBar.NavigationBar.goToHistory"() {
    (new navigationBar.NavigationBar()).goToHistory()
}


def static "navigationBar.NavigationBar.logOut"() {
    (new navigationBar.NavigationBar()).logOut()
}


def static "logIn.LogIn.logIn"(
    	Object username	
     , 	Object password	) {
    (new logIn.LogIn()).logIn(
        	username
         , 	password)
}


def static "makeAppointment.MakeAppointment.fillOutForm"(
    	String facility	
     , 	String readmission	
     , 	String program	
     , 	String date	
     , 	String comment	) {
    (new makeAppointment.MakeAppointment()).fillOutForm(
        	facility
         , 	readmission
         , 	program
         , 	date
         , 	comment)
}
