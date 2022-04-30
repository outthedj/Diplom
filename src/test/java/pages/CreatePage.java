package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreatePage {

    private SelenideElement projectNameField = $(By.id("inputTitle"));
    private SelenideElement createProjectButton = $(By.xpath("//button[@class='btn btn-primary']"));

    @Step("Creating new project")
    public void createNewProject() {
        createProjectButton.shouldBe(Condition.enabled);
        Faker faker = new Faker();
        projectNameField.sendKeys(faker.beer().name());
        createProjectButton.click();
    }
}
