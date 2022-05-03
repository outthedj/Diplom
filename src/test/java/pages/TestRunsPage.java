package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestRunsPage {

    private SelenideElement testRunMenuButton = $(By.id("menu-link-test-runs"));
    private SelenideElement startNewTestRunButton = $(By.id("start-new-test-run-button"));
    private SelenideElement startRunButton = $(By.id("save-run-button"));
    private SelenideElement addTestCaseButton = $(By.id("edit-run-add-cases-button"));
    private SelenideElement chooseTestCaseCheckbox = $(By.xpath("//span[@class='custom-control-indicator']"));
    private SelenideElement doneButton = $(By.id("select-cases-done-button"));
    private SelenideElement testRunCreatedMessage = $(By.xpath("//span[@class='alert-message']"));
    private SelenideElement testRunAdditionMenuButton = $(By.xpath("//a[@class='btn btn-dropdown']"));
    private SelenideElement deleteTestRunButton = $(By.xpath("//a[@class='text-danger']"));
    private SelenideElement confirmDeleteTestRunButton = $(By.xpath("//button[@type='submit']"));
    private SelenideElement testRunDeleteMessage = $(By.xpath("//span[@class='alert-message']"));

    @Step("Opening Test runs page")
    public void openTestRunMenu() {
        testRunMenuButton.shouldBe(Condition.enabled);
        testRunMenuButton.click();
        testRunMenuButton.click();
    }

    @Step("Creating Test run")
    public void createTestRun() {
        startNewTestRunButton.shouldBe(Condition.enabled);
        startNewTestRunButton.click();
        startRunButton.shouldBe(Condition.enabled);
        startRunButton.click();
        addTestCaseButton.shouldBe(Condition.enabled);
        addTestCaseButton.click();
        chooseTestCaseCheckbox.shouldBe(Condition.enabled);
        chooseTestCaseCheckbox.click();
        doneButton.shouldBe(Condition.enabled);
        doneButton.click();
        startRunButton.shouldBe(Condition.enabled);
        startRunButton.click();
    }

    @Step("Checking if test run was created")
    public boolean wasTestRunCreated() {
        return testRunCreatedMessage.isDisplayed();
    }

    @Step("Deleting Test run")
    public void deleteTestRun() {
        testRunAdditionMenuButton.shouldBe(Condition.enabled);
        testRunAdditionMenuButton.click();
        deleteTestRunButton.shouldBe(Condition.enabled);
        deleteTestRunButton.click();
        confirmDeleteTestRunButton.shouldBe(Condition.enabled);
        confirmDeleteTestRunButton.click();
    }

    @Step("Checking if test run was deleted")
    public boolean wasTestRunDeleted() {
        return testRunDeleteMessage.isDisplayed();
    }
}
