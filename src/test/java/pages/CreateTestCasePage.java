package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateTestCasePage {

    private SelenideElement testCaseTitleField = $(By.id("title"));
    private SelenideElement saveTestCaseButton = $(By.id("save-case"));

    @Step("Creating test case")
    public void createTestCase() {
        testCaseTitleField.shouldBe(Condition.enabled);
        Faker faker = new Faker();
        testCaseTitleField.sendKeys(faker.artist().name());
        saveTestCaseButton.shouldBe(Condition.enabled);
        saveTestCaseButton.click();
    }
}
