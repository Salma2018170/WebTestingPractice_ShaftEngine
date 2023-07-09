package basis;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class Base {
    protected SHAFT.GUI.WebDriver driver;
    private final String URL="https://demo.nopcommerce.com/";
    //pages
    protected HomePage homePage;
    protected RegisterPage registerPage;

    @BeforeClass
    public void beforeClass() {
        SHAFT.Properties.flags.set().autoCloseDriverInstance(false);
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(URL,"nopcommerce");
        homePage=new HomePage(driver);
    }
//    @Test
//    public void tryyy(){
//        homePage.goToRegisterPage();
//    }
    @AfterClass(alwaysRun = false)
    public void afterClass(){
       // driver.quit();
    }
}
