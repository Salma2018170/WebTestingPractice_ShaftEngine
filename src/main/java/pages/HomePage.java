package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
    SHAFT.GUI.WebDriver driver;
    //Locators
    private By registerButton=By.xpath("//a[@class=\"ico-register\"]");
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //Action
    public void goToRegisterPage(){
       driver.element().click(registerButton);
    }


}