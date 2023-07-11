package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class ChangePasswordTC extends Base {
    @Test(description = "change password with valid data")
    public void changePasswordTC01() {
        logInPage = homePage.goToLogInPage();
        logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
        myAccountPage = logInPage.goToMyContentPage();
        changePasswordPage = myAccountPage.goToChangePasswordPage();
        changePasswordPage.setChangePasswordData(testData.getTestData("password"),"123456","123456");
        changePasswordPage.verifyPasswordChanged();

    }


}
