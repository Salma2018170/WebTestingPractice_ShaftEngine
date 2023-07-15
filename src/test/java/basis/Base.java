package basis;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class Base {
    protected SHAFT.GUI.WebDriver driver;
    protected SHAFT.TestData.JSON testData;
    private final String URL="https://demo.nopcommerce.com/";

    //pages
    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LogInPage logInPage;
    protected ComputersCategoriesPage computersPage;
    protected MyAccountPage myAccountPage;
    protected  ChangePasswordPage changePasswordPage;
    protected WishListPage wishListPage;


    @BeforeClass
    public void beforeClass() {
       // SHAFT.Properties.reporting.set().openAllureReportAfterExecution(true);
        SHAFT.Properties.flags.set().autoCloseDriverInstance(false);
        driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("logInData.json");
        driver.browser().navigateToURL(URL,"nopcommerce");
        homePage=new HomePage(driver);

    }
//    @Test
//    public void tryyy(){
//        homePage.goToRegisterPage();
//    }
    @AfterClass(alwaysRun = false)
    public void afterClass(){
       //driver.quit();
    }
}
