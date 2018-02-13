package testingweek;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intermediate_1 {

    private WebDriver webDriver;
    private static final String BASE_URL = "http://thedemosite.co.uk/addauser.php";

    @Before
    public void setup()
    {
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Test
    public void makeAccount()
    {
        WebElement usernameField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
        WebElement passwordField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
        WebElement saveButton = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));

        usernameField.sendKeys("I NEED");
        passwordField.sendKeys("SLEEP");
        saveButton.click();

        WebElement link = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
        link.click();
        login();
    }

    public void login()
    {

        WebElement usernameField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
        WebElement passwordField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
        WebElement loginButton = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));

        usernameField.sendKeys("I NEED");
        passwordField.sendKeys("SLEEP");
        loginButton.click();
        WebElement label = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
        String x = label.getText();
        Assert.assertEquals("Login failed", "**Successful Login**", x);

    }


    @After
    public void cleanup()
    {
        webDriver.quit();
    }

}
