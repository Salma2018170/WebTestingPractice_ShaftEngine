package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class ComputersCategoriesPage {
    private SHAFT.GUI.WebDriver driver;
    //element
    By noteBookElement= By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a");
    By item1Element=By.partialLinkText("Apple MacBook Pro 13-inch");
    By cartButton=By.id("add-to-cart-button-4");
    public ComputersCategoriesPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    //Actions
    public void chooseNotebookCategory(){
     driver.element().click(noteBookElement);
    }
    public void addItem1ToCart(){
        driver.element().click(item1Element);
        driver.element().click(cartButton);

    }
}
