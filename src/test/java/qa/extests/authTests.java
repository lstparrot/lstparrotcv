package qa.extests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import scripts.scriptsForTest;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class authTests {

    scriptsForTest email = new scriptsForTest();
    String emailsecond = email.email;
    scriptsForTest num = new scriptsForTest();
    String numsecond = String.valueOf(num.num);





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


}
