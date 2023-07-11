package pages;

import com.shaft.driver.SHAFT;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;

public class ChangePasswordPage {
    SHAFT.GUI.WebDriver driver;
    //Element
    //you can use xpath //p=[@class"content"]
    By changePasswordMessage = By.className("content");
    By oldPassword = By.id("OldPassword");
    By newPassword = By.id("NewPassword");
    By confirmPassword = By.id("ConfirmNewPassword");
    By changePasswordButton = By.xpath("//button[@class=\"button-1 change-password-button\"]");

    public ChangePasswordPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void setChangePasswordData(String oldPassword, String newPassword, String confirmPassword) {
        driver.element().type(this.oldPassword, oldPassword)
                .type(this.newPassword, newPassword)
                .type(this.confirmPassword, confirmPassword)
                .click(changePasswordButton);
    }

    public void verifyPasswordChanged() {
        driver.element().verifyThat(changePasswordMessage).exists().perform();
    }
}
