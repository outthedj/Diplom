package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    private SelenideElement createNewProjectButton = $(By.id("createButton")); //a[contains(text(),'Delete')]
    private SelenideElement projectDropDown = $(By.xpath("//a[@class='btn btn-dropdown']"));
    private SelenideElement deleteProject = $(By.xpath("//a[contains(text(),'Delete')]"));
    private SelenideElement confirmDeleteProject = $(By.xpath("//button[@class='btn btn-cancel']"));
    private SelenideElement noProjects = $(By.xpath("//span[@class='no-project mt-4']"));

    @Step("Checking is login successful")
    public boolean createNewProjectButtonIsEnabled() {
        return createNewProjectButton.isDisplayed();
    }

    @Step("Creating new project")
    public void createNewProjectButtonClick() {
        createNewProjectButton.click();
    }

    @Step("Deleting project")
    public void clickOnProjectDropDown() {
        projectDropDown.shouldBe(Condition.enabled);
        projectDropDown.click();
        deleteProject.shouldBe(Condition.enabled);
        deleteProject.click();
        confirmDeleteProject.shouldBe(Condition.enabled);
        confirmDeleteProject.click();
    }

    @Step("Checking that there are no projects")
    public boolean checkingNoProjects() {
        noProjects.shouldBe(Condition.enabled);
        return noProjects.isDisplayed();
    }
}
