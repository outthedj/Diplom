package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreatedProjectPage {

    private SelenideElement nameOfNewProject = $(By.xpath("//p[@class='header']"));

    @Step("Checking that new project has been created")
    public boolean isNameOfNewProjectDisplayed() {
        return nameOfNewProject.isDisplayed();
    }
}
