package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
    SHAFT.GUI.WebDriver driver;
    //Locators
    private final By registerButton=By.xpath("//a[@class=\"ico-register\"]");
    private final By registerHead=By.tagName("h1");
    private final By logInButton=By.className("ico-login");
    private final By computerElement=By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    private final By blogElement=By.linkText("Blog");
    private final By customerCurrency=By.id("customerCurrency");
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
    public LogInPage goToLogInPage(){
        driver.element().click(logInButton);
        return new LogInPage(driver);
    }

    public ComputersCategoriesPage gotToComputersPage(){
        driver.element().click(computerElement);
        return new ComputersCategoriesPage(driver);
    }
    public  BlogPage goToBlogPage(){
        driver.element().click(blogElement);
        return new BlogPage(driver);
    }
    public void changeCurrencyToEuro(){
       driver.element().select(customerCurrency,"Euro");
    }
}
