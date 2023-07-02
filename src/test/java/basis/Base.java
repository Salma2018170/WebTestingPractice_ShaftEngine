package basis;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
    SHAFT.GUI.WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        //testData = new SHAFT.TestData.JSON("simpleJSON.json");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        driver.quit();
    }
}
