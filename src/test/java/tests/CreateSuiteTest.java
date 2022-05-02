package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Retry;

public class CreateSuiteTest extends BaseTest{

    @Test(priority = 1, description = "Test checks creating new project", retryAnalyzer = Retry.class)
    @Description("Test checks creating new suite")
    public void isNewSuiteCreated() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        ProjectsPage projectsPage = new ProjectsPage();
        projectsPage.createNewProjectButtonClick();
        CreatePage createPage = new CreatePage();
        createPage.createNewProject();
        RepositoryPage repositoryPage = new RepositoryPage();
        repositoryPage.createNewSuite();
        Assert.assertTrue(repositoryPage.isSuiteCreated());
    }
}
