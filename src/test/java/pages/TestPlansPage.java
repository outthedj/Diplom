package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestPlansPage {

    private SelenideElement testPlanMenuButton = $(By.id("menu-link-test-plans"));
    private SelenideElement createPlanButton = $(By.id("createButton"));
    private SelenideElement testPlanTitleField = $(By.id("title"));
    private SelenideElement addTestCaseButton = $(By.id("edit-plan-add-cases-button"));
    private SelenideElement chooseTestCaseCheckbox = $(By.xpath("//span[@class='custom-control-indicator']"));
    private SelenideElement doneButton = $(By.id("select-cases-done-button"));
    private SelenideElement createPlanFinallyButton = $(By.id("save-plan"));
    private SelenideElement testPlanCreatedMessage = $(By.xpath("//span[@class='alert-message']"));

    @Step("Opening Test plans page")
    public void openTestPlanMenu() {
        testPlanMenuButton.shouldBe(Condition.enabled);
        testPlanMenuButton.click();
        testPlanMenuButton.click();
    }

    @Step("Creating Test plan")
    public void createTestPlan() {
        createPlanButton.shouldBe(Condition.enabled);
        createPlanButton.click();
        Faker faker = new Faker();
        testPlanTitleField.sendKeys(faker.artist().name());
        addTestCaseButton.shouldBe(Condition.enabled);
        addTestCaseButton.click();
        chooseTestCaseCheckbox.shouldBe(Condition.enabled);
        chooseTestCaseCheckbox.click();
        doneButton.shouldBe(Condition.enabled);
        doneButton.click();
        createPlanFinallyButton.shouldBe(Condition.enabled);
        createPlanFinallyButton.click();
    }

    @Step("Checking if test plan was created")
    public boolean wasTestPlanCreated() {
        return testPlanCreatedMessage.isDisplayed();
    }
}
