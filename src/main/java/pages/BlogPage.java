package pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class BlogPage {
    SHAFT.GUI.WebDriver driver;
    By detailsButton2 = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/a[2]");
    By elementDetails = By.tagName("h1");
    By commentTextField=By.id("AddNewComment_CommentText");
    By blogMessage=By.className("result");

    public BlogPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public void readMoreAboutSecondBlog() {
        driver.element().click(detailsButton2);
    }

    public void verifyMoreDetailsShown() {
        driver.verifyThat().element(elementDetails).exists().perform();
    }

    public void leaveComment(String text) {
        driver.element().type(commentTextField,text);
    }
    public void verifyCommentAddedSuccessful() {
        driver.verifyThat().element(blogMessage).exists().perform();
    }
}
