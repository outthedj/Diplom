package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WorkSpacePage {

    private SelenideElement settingsButton = $(By.xpath("//a[@data-bs-original-title='Settings']"));
    private SelenideElement newNameOfWorkSpace = $(By.xpath("//span[@class='subheader ms-0 mt-2']"));

    @Step("Opening Settings page")
    public void openSettingsPage() {
        settingsButton.shouldBe(Condition.enabled);
        settingsButton.click();
    }

    @Step("Checking if Workspace name was renamed")
    public String checkingRenamingOfWorkspace() {
        newNameOfWorkSpace.shouldBe(Condition.enabled);
        return newNameOfWorkSpace.getText();
    }
}
