import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author MilanPesa - r0789334
 * @author JowanAbdo - r0789086
 */

public class LoginPage extends Page {

    @FindBy(id="userid")
    private WebElement useridField;


    @FindBy(id="password")
    private WebElement passwordField;

    @FindBy(id="login")
    private WebElement loginButton;

    public LoginPage (WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"");
    }

    public void setUserId(String userId) {
        this.useridField = driver.findElement(By.id("userid"));
        useridField.clear();
        useridField.sendKeys(userId);
    }


    public void setPassword(String password) {
        this.passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void login(String userid, String password) {
        setUserId(userid);
        setPassword(password);
        submit();
    }


    public void submit() {
        this.loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    public void logout() {
        driver.findElement(By.id("logout")).click();
    }
    public boolean isLoggedOut() {

        try {
            WebElement test = driver.findElement(By.id("hello"));
        } catch (Exception e){
            return true;
        }

        return false;
    }
    public boolean tryLogout (){
        this.driver.get(getPath()+"?command=Logout");
        return hasErrorMessage();
    }
    public boolean hasErrorMessage () {
        WebElement errorMsg = driver.findElement(By.cssSelector("div.alert-danger ul li"));
        return (errorMsg != null);
    }


}