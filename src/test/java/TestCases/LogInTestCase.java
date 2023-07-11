package TestCases;

import basis.Base;
import org.testng.annotations.Test;


public class LogInTestCase extends Base {
    @Test
    public void logInTC01() {
        logInPage = homePage.goToLogInPage();
        logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
    }

}
