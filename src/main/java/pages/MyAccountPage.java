package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class MyAccountPage {
    SHAFT.GUI.WebDriver driver;
    //Element
    By changePasswordButton = By.partialLinkText("Change password");

    public MyAccountPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public ChangePasswordPage goToChangePasswordPage() {
        driver.element().click(changePasswordButton);
        return new ChangePasswordPage(driver);
    }
}
