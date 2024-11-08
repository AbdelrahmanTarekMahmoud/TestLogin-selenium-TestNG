package Login;


import Pages.LoginPage;
import Pages.SecureArea;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin()
    {
        LoginPage loginPage = homePage.ClickFormAutentication();
        loginPage.EnterUserName("tomsmith");
        loginPage.EnterPassword("SuperSecretPassword!");
        SecureArea secureArea = loginPage.CLickSumbit();
        assertTrue(secureArea.CheckTrue().contains("You logged into a secure area!"));

    }
}
