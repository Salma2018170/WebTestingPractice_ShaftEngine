package TestCases;

import basis.Base;
import com.shaft.driver.SHAFT;
import com.sun.jna.platform.unix.solaris.LibKstat;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

public class RegistrationTC extends Base {
    public static String emailData ;
    @Test(description = "Register with valid data")
    public void TC01() {
        emailData= "test" + new Date().getTime() + "@test.com";
        registerPage = homePage.goToRegisterPage();
        homePage.verifyRegister();
        registerPage.setRegisterData(
                "Salma",
                "Mohamed",
                "17",
                "8",
                "2000",
                testData.getTestData("email"),
                "xxx",
                "113388",
                "113388");
    }
}
