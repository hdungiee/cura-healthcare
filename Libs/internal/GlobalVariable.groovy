package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL_summary
     
    /**
     * <p></p>
     */
    public static Object URL_login
     
    /**
     * <p></p>
     */
    public static Object URL_appointment
     
    /**
     * <p></p>
     */
    public static Object URL_homepage
     
    /**
     * <p></p>
     */
    public static Object URL_history
     
    /**
     * <p></p>
     */
    public static Object URL_profile
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            URL_summary = selectedVariables['URL_summary']
            URL_login = selectedVariables['URL_login']
            URL_appointment = selectedVariables['URL_appointment']
            URL_homepage = selectedVariables['URL_homepage']
            URL_history = selectedVariables['URL_history']
            URL_profile = selectedVariables['URL_profile']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
