package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import staticdata.WebUrls;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement emailInput = $(By.id("inputEmail"));
    private SelenideElement passwordInput = $(By.id("inputPassword"));
    private SelenideElement loginButton = $(By.id("btnLogin"));

    @Step("Opening login page")
    public void openLoginPage() {
        open(WebUrls.LOGIN_URL);
    }

    @Step("Trying to log in")
    public void login() {
        emailInput.sendKeys("outthedj@yopmail.com");
        passwordInput.sendKeys("1113444Out!");
        loginButton.shouldBe(Condition.enabled);
        loginButton.click();
    }

    @Step("Trying to log in")
    public void login1() {
        emailInput.sendKeys("outthedj1@yopmail.com");
        passwordInput.sendKeys("1113444Out!");
        loginButton.shouldBe(Condition.enabled);
        loginButton.click();
    }

    @Step("Checking that logout was successful")
    public boolean wasLogoutSuccessful() {
        loginButton.shouldBe(Condition.enabled);
        return loginButton.isDisplayed();
    }
}
