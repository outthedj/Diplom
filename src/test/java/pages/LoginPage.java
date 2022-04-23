package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import staticdata.WebUrls;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement emailInput = $(By.id("inputEmail"));
    private SelenideElement passwordInput = $(By.id("inputPassword"));
    private SelenideElement loginButton = $(By.id("btnLogin"));

    public void openLoginPage() {
        open(WebUrls.LOGIN_URL);
    }

    public void login(String email, String password) {
        loginButton.shouldBe(Condition.enabled);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
