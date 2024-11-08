package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameId = By.id("username");
    private By PasswordId = By.id("password");
    private By SumbitButton = By.cssSelector("#login button");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void EnterUserName(String UserName)
    {
        driver.findElement(userNameId).sendKeys(UserName);
    }
    public void EnterPassword(String Password)
    {
        driver.findElement(PasswordId).sendKeys(Password);
    }
    public SecureArea CLickSumbit()
    {
        driver.findElement(SumbitButton).click();
        return new SecureArea(driver);
    }
}
