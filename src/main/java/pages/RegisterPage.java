package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class RegisterPage {
    SHAFT.GUI.WebDriver driver;
    //Element
    By genderButtonFemale = By.id("gender-female");
    By firstName=By.id("FirstName");
    By lastName=By.id("LastName");
    //DataBirth dropDown
    By day=By.name("DateOfBirthDay");
    By month=By.name("DateOfBirthMonth");
    By year=By.name("DateOfBirthYear");
    By email =By.id("Email");
    By company=By.id("Company");
    By password=By.id("Password");
    By confirmPassword=By.id("ConfirmPassword");
    By registerButton=By.id("register-button");
    RegisterPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //Action
    public void setRegisterData() {
        driver.element().click(genderButtonFemale)
                        .type(firstName,"Salma")
                        .type(lastName,"Hamed")
                        .select(day,"2")
                        .select(month,"8")
                        .select(year,"2000")
                        .type(email,"salma@gmail.com")
                        .type(company,"Aman")
                        .type(password,"112233")
                        .type(confirmPassword,"112233")
                        .click(registerButton);
        //driver.element().
    }
}
