package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    private By SuccessFlag  = By.id("flash");
    public SecureArea(WebDriver driver)
    {
        this.driver = driver;
    }
    public String CheckTrue()
    {
        return driver.findElement(SuccessFlag).getText();
    }
}
