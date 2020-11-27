import org.openqa.selenium.WebDriver;
/**
 * @author MilanPesa - r0789334
 * @author JowanAbdo - r0789086
 */
public abstract class Page {

    WebDriver driver;
    String path = "http://localhost:8080/Week1_war/Controller";

    public Page (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getPath() {
        return path;
    }

    public String getTitle () {
        return driver.getTitle();
    }

}