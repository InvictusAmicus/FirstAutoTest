package testingweek;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebExample
{

    private WebDriver webDriver;
    private static final String BASE_URL = "https://www.qa.com";

    @Before
    public void setup()
    {
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Test
    public void runs()
    {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        WebElement searchBar = webDriver.findElement(By.cssSelector("#select2-chosen-2"));


        searchBar.sendKeys("THE SHAFEEQ");
    }


    @After
    public void cleanUp()
    {
        webDriver.quit();
    }


}
