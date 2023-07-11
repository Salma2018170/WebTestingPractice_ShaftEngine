package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class LogInPage {
    SHAFT.GUI.WebDriver driver;
    //Element
    By emailText= By.id("Email");
    By passwordText= By.id("Password");
    By logInButton=By.xpath("//button[@class=\"button-1 login-button\"]");
     public LogInPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }


    public HomePage setEmailAndPassword(String emailS,String password) {
                driver.element().type(emailText,emailS)
                        .type(passwordText,password)
                        .click(logInButton);
                return new HomePage(driver);
    }
}
