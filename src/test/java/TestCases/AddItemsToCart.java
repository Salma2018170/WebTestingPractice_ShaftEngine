package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class AddItemsToCart extends Base {
    @Test
    public void addItemTC01(){
        logInPage = homePage.goToLogInPage();
        homePage=logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
                 computersPage=homePage.gotToComputersPage();

    }
}
