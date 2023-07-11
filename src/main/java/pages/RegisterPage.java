package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.python.antlr.ast.Str;

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
    public void setRegisterData(String firstNameS,String lastNameS,String dayS,String monthS ,String yearS,String emailS ,String companyS,String passwordS,String confirmPasswordS) {
        driver.element().click(genderButtonFemale)
//                        .type(firstName,"Salma")
//                        .type(lastName,"Mohamed")
//                        .select(day,"17")
//                        .select(month,"8")
//                        .select(year,"2000")
//                        .type(email,"Salma@gmail.com")
//                        .type(company,"Aman")
//                        .type(password,"113388")
//                        .type(confirmPassword,"113388")
//                        .click(registerButton);
        .type(firstName,firstNameS)
                .type(lastName,lastNameS)
                .select(day,dayS)
                .select(month,monthS)
                .select(year,yearS)
                .type(email,emailS)
                .type(company,companyS)
                .type(password,passwordS)
                .type(confirmPassword,confirmPasswordS)
                .click(registerButton);
//        driver.element().
    }
}
