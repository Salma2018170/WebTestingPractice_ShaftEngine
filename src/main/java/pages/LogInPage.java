package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LogInPage {
    SHAFT.GUI.WebDriver driver;
    //Element
    By emailText= By.id("Email");
    By passwordText= By.id("Password");
    By logInButton=By.xpath("//button[@class=\"button-1 login-button\"]");

    By myContentButton=By.className("ico-account");
    protected By errorMessage=By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
     public LogInPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }


    public HomePage setEmailAndPassword(String emailS,String password) {
                driver.element().type(emailText,emailS)
                        .type(passwordText,password)
                        .click(logInButton);
                return new HomePage(driver);
    }
    public MyAccountPage goToMyContentPage(){
         driver.element().click(myContentButton);
         return new MyAccountPage(driver);
    }
    public void verifyThatLoginSuccessful(){
         driver.element().verifyThat(errorMessage).doesNotExist().perform();
    }
}
