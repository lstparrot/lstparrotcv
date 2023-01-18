package qa.extests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import scripts.scriptsForTest;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class authTests {

    private WebDriver driver = new WebDriverProvider().get();
    private scriptsForTest email = new scriptsForTest();
    private String emailsecond = email.email;
    private scriptsForTest num = new scriptsForTest();
    private String numsecond = String.valueOf(num.num);

    @Disabled
    @Test
    void gitTest(){
        String title = driver.getTitle();
        assertEquals(title, "Git  hub");
    }


    @Disabled
    @DisplayName("Authorisation Whisk (Sign Up)")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void auth() {
        Selenide.clearBrowserCookies();
        Selenide.open("https://my.whisk.com/");
        $(".s11199").click();
        $(".s11226").setValue(String.valueOf(emailsecond));
        $("[data-testid=auth-continue-button]").click();
        $("[data-testid=df93b370-5132-6be4-fbb2-632d6152a4e2]").click();
    }
    @Disabled
    @DisplayName("Create new post")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void newPost() {
        Selenide.clearBrowserCookies();
        Selenide.open("https://my.whisk.com/");
        $(".s11199").click();
        $(".s11226").setValue(String.valueOf(emailsecond));
        $("[data-testid=auth-continue-button]").click();
        $("[data-testid=df93b370-5132-6be4-fbb2-632d6152a4e2]").click();
        $("[data-testid=home-nav-link]").click();
        $("[data-testid=f935e59a-2955-225a-4443-3853827352b0]").click();
        $("[data-testid=UI_KIT_TEXTAREA]").setValue(numsecond);
        $(".s11198.s484").click();
    }

    @AfterEach
    public void stopDriver(){
        driver.quit();
    }


}
