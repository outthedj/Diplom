package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    private SelenideElement createNewProjectButton = $(By.id("createButton"));

    public boolean createNewProjectButtonIsEnabled() {
        return createNewProjectButton.isDisplayed();
    }
}
