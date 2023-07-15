package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class BlogTC extends Base {
    @Test(description = "see Blog details for e-Commerce business")
    public void TC01() {
        logInPage = homePage.goToLogInPage();
        homePage = logInPage.setEmailAndPassword(
                testData.getTestData("email"),
                testData.getTestData("password"));
        logInPage.verifyThatLoginSuccessful();
    }

    @Test(description = "ADD comment in Blog details page ",dependsOnMethods = "TC01")
    public void TC02() {
        blogPage = homePage.goToBlogPage();
        blogPage.readMoreAboutSecondBlog();
        blogPage.verifyMoreDetailsShown();
        blogPage.leaveComment("This is a sample comment for this blog post");
        blogPage.verifyCommentAddedSuccessful();
    }
}
