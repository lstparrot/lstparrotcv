package config;

import com.codeborne.selenide.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {
    private WebDriverConfig config;

    public WebDriverProvider() {
        this.config = new WebDriverConfig();

    }

    public enum Browser {

        CHROME,

        FIREFOX,

        SAFARI

    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseURL());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (config.getBrowser().equals(Browser.CHROME)) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if (config.getBrowser().equals(Browser.FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        if (config.getBrowser().equals(Browser.SAFARI)) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }
        throw new RuntimeException("No such browser");

    }
}
