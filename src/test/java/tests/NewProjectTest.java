package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreatePage;
import pages.CreatedProjectPage;
import pages.LoginPage;
import pages.ProjectsPage;
import utilities.Retry;

public class NewProjectTest extends BaseTest{

    @Test(priority = 1, description = "Test checks creating new project", retryAnalyzer = Retry.class)
    @Description("Check is creating new project works correct")
    public void isNewProjectCreated() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        ProjectsPage projectsPage = new ProjectsPage();
        projectsPage.createNewProjectButtonClick();
        CreatePage createPage = new CreatePage();
        createPage.createNewProject();
        CreatedProjectPage createdProjectPage = new CreatedProjectPage();

        Assert.assertTrue(createdProjectPage.isNameOfNewProjectDisplayed());
    }
}
