package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class ComputersCategoriesPage {
    private final SHAFT.GUI.WebDriver driver;
    //element
    By noteBookElement = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a");
    By item1Element = By.partialLinkText("Apple MacBook Pro 13-inch");
    By cartButton = By.id("add-to-cart-button-4");
    //wish list Element
    By wishButton2 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]");
    By wishButton3 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[3]");
    By wishButton4 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[4]/div/div[2]/div[3]/div[2]/button[3]");
    By wishButton5 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[5]/div/div[2]/div[3]/div[2]/button[3]");
    By wishButton6 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[6]/div/div[2]/div[3]/div[2]/button[3]");
    By wishlistButton = By.className("wishlist-label");

    public ComputersCategoriesPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void chooseNotebookCategory() {
        driver.element().click(noteBookElement);
    }

    public void addItem1ToCart() {
        driver.element().click(item1Element);
        driver.element().click(cartButton);

    }

    public void addItemsToWishList() {
        driver.element().click(wishButton2)
                .click(wishButton3).click(wishButton4)
                .performBrowserAction().
                element().click(wishButton5).click(wishButton6);
    }

    public void verifyThatItemAddToWishList() {
        driver.element().verifyThat(By.xpath("//p[@class=\"content\"]")).exists().perform();
        driver.element().click(By.className("close"));
    }

    public WishListPage goToWishList() {
        driver.element().click(wishlistButton);
        return new WishListPage(driver);
    }
}
