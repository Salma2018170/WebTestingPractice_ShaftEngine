package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class RegistrationTC extends Base {
   @Test(description = "Register with valid data")
    public void TC01(){
       registerPage=homePage.goToRegisterPage();
       homePage.verifyRegister();
       registerPage.setRegisterData();

   }
}
