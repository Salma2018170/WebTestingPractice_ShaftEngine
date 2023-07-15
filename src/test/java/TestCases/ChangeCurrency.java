package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class ChangeCurrency extends Base {


    @Test(description = "Change currency to Euro")
    public void TC01(){
        logInPage = homePage.goToLogInPage();
        logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
        homePage.changeCurrencyToEuro();
    }
}
