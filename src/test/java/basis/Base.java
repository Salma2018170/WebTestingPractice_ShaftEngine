package basis;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class Base {
    SHAFT.GUI.WebDriver driver;
    private String URL="https://demo.nopcommerce.com/";
    protected HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(URL,"nopcommerce");
        homePage=new HomePage(driver);
    }
    @Test
    public void tryyy(){
        homePage.goToRegisterPage();
    }
    @AfterClass(alwaysRun = false)
    public void afterClass(){
       // driver.quit();
    }
}
