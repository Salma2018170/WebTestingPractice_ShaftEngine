package TestCases;

import basis.Base;
import org.testng.annotations.Test;

public class RegistrationTC extends Base {
   @Test
    public void TC01(){
       homePage.goToRegisterPage();
       homePage.verifyRegister();
   }
}
