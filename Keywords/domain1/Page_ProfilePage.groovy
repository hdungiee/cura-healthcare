package domain1

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Page_ProfilePage {
	static def logOut() {
		WebUI.click(findTestObject('Page_ProfilePage/Button_Log out'))
	}
}
