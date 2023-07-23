package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SettingsPage {

    private SelenideElement workSpaceNameField = $(By.id("inputTitle"));
    private SelenideElement updateSettingsButton = $(By.xpath("//button[@class='btn btn-primary']"));

    @Step("Renaming work space")
    public void renameWorkSpace() {
        workSpaceNameField.shouldBe(Condition.enabled);
        workSpaceNameField.doubleClick();
        workSpaceNameField.sendKeys("666");
        updateSettingsButton.shouldBe(Condition.enabled);
        updateSettingsButton.click();
    }
}
