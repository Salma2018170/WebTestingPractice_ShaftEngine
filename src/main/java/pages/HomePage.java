package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
    SHAFT.GUI.WebDriver driver;
    //Locators
    private By registerButton=By.xpath("//a[@class=\"ico-register\"]");
    private By registerHead=By.tagName("h1");
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //Action
    public RegisterPage goToRegisterPage(){
        driver.element().click(registerButton);
        return new RegisterPage(driver);
    }
    public void verifyRegister(){
        driver.element().verifyThat(registerHead).exists().perform();
    }


}
