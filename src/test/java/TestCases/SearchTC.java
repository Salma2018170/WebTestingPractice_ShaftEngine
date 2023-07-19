package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class SearchTC extends Base {
    @Test
    public void TC01() {
        logInPage = homePage.goToLogInPage();
        homePage = logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
        searchPage = homePage.goToSearchPage();
        searchPage.fillSearchField();
        searchPage.verifySearchWrong();
    }
}
