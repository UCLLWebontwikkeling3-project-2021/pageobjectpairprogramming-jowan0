import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author MilanPesa - r0789334
 * @author JowanAbdo - r0789086
 */
public class LogoutTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/Users/.../web3pers/chromedriver");
        // windows: gebruik dubbele \\ om pad aan te geven
        // hint: zoek een werkende test op van web 2 ...
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        this.loginPage = new LoginPage(driver);

    }

    @After
    public void clean() {
        //driver.quit();
    }

    @Test
    public void test_Logout_Works() {
        loginPage.login("123","t");
        loginPage.logout();
        assertTrue(loginPage.isLoggedOut());

    }
    @Test
    public void test_logout_without_being_logged_throws_error() {
        assertTrue(loginPage.tryLogout());

    }
}