package basis;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ComputersCategoriesPage;
import pages.HomePage;
import pages.LogInPage;
import pages.RegisterPage;

import java.util.Date;

public class Base {
    protected SHAFT.GUI.WebDriver driver;
    protected SHAFT.TestData.JSON testData;
    private final String URL="https://demo.nopcommerce.com/";

    //pages
    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LogInPage logInPage;
    protected ComputersCategoriesPage computersPage;


    @BeforeClass
    public void beforeClass() {

        driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("logInData.json");
        driver.browser().navigateToURL(URL,"nopcommerce");
        homePage=new HomePage(driver);

    }
//    @Test
//    public void tryyy(){
//        homePage.goToRegisterPage();
//    }
    @AfterClass(alwaysRun = true)
    public void afterClass(){
        SHAFT.Properties.flags.set().autoCloseDriverInstance(false);
    }
}
