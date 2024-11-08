package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //open the web site
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }

}
