package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SelenuimTest {

    private final BrowserGetter getter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = getter.getChromeDriver();

    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openThePageAndCheckTheTitle() {
        String expectedTitle = "Example Title";
        driver.get("https://www.example.com");
        assertEquals(expectedTitle, driver.getTitle());
    }


}
