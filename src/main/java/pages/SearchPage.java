package pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.internal.FluentElementActions;
import org.openqa.selenium.By;

public class SearchPage {
    SHAFT.GUI.WebDriver driver;

    private final By searchKeywordText= By.xpath("//*[@id=\"q\"]");
    private final By advancedCheckBox=By.id("advs");
    private final By categoryDropDown=By.id("cid");
    private final By manufacturerDropDown=By.id("mid");
    private final By searchButton=By.xpath("//button[@class=\"button-1 search-button\"]");
    private final By noResultMessage=By.className("no-result");
    public SearchPage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
    public void fillSearchField (){
        driver.element().type(searchKeywordText,"SHAFT Engine")
                .click(advancedCheckBox)
                .select(categoryDropDown,"Computers")
                .select(manufacturerDropDown,"1")
                .click(searchButton);
    }
    public void verifySearchWrong(){
        driver.element().verifyThat(noResultMessage).exists().perform();
        driver.element().captureScreenshot(noResultMessage);
    }


}
