package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {

    private SelenideElement createSuiteButton = $(By.id("create-suite-button"));
    private SelenideElement suiteNameField = $(By.id("name"));
    private SelenideElement saveSuiteButton = $(By.id("save-suite-button"));
    private SelenideElement suiteCreated = $(By.xpath("//a[@class='style_title-1ehyC']"));
    private SelenideElement createCaseButton = $(By.id("create-case-button"));
    private SelenideElement caseCreated = $(By.xpath("//div[@class='style_itemCell-3gHZi style_title-3pZF1']"));
    private SelenideElement projectsButton = $(By.xpath("//span[contains(text(),'Projects')]"));
    private SelenideElement userMenu = $(By.id("user-menu"));
    private SelenideElement logoutButton = $(By.xpath("//a[@href='https://app.qase.io/logout']"));

    @Step("Creating new project")
    public void createNewSuite() {
        createSuiteButton.shouldBe(Condition.enabled);
        createSuiteButton.click();
        Faker faker = new Faker();
        suiteNameField.shouldBe(Condition.enabled).sendKeys(faker.beer().name());
        suiteNameField.sendKeys(faker.beer().name());
        saveSuiteButton.shouldBe(Condition.enabled);
        saveSuiteButton.click();
    }

    @Step("Creating new test case")
    public void createNewCase() {
        createCaseButton.shouldBe(Condition.enabled);
        createCaseButton.click();
    }

    @Step("Is suite created?")
    public boolean isSuiteCreated() {
        suiteCreated.shouldBe(Condition.enabled);
        return suiteCreated.isDisplayed();
    }

    @Step("Is case created?")
    public boolean isCaseCreated() {
        caseCreated.shouldBe(Condition.enabled);
        return caseCreated.isDisplayed();
    }

    @Step("Opening projects")
    public void clickOnProjectButton() {
        projectsButton.shouldBe(Condition.enabled);
        projectsButton.click();
    }

    @Step("Logouting")
    public void makeLogout() {
        userMenu.shouldBe(Condition.enabled);
        userMenu.click();
        logoutButton.shouldBe(Condition.enabled);
        logoutButton.click();
    }
}
