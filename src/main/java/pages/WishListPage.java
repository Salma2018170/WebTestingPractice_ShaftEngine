package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class WishListPage {
    SHAFT.GUI.WebDriver driver;

    public WishListPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public void scrollToItem(){
     driver.element().scrollToElement(By.partialLinkText("Lenovo Thinkpad X1 Carbon Laptop"));
    }
}
