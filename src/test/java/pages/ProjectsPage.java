package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    private SelenideElement createNewProjectButton = $(By.id("createButton"));

    @Step("Checking is login successful")
    public boolean createNewProjectButtonIsEnabled() {
        return createNewProjectButton.isDisplayed();
    }
}
