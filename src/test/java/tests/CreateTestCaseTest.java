package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Retry;

public class CreateTestCaseTest extends BaseTest{

    @Test(priority = 1, description = "Test checks creating new test case", retryAnalyzer = Retry.class)
    @Description("Test checks creating new test case")
    public void isNewTestCaseCreated() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        ProjectsPage projectsPage = new ProjectsPage();
        projectsPage.createNewProjectButtonClick();
        CreatePage createPage = new CreatePage();
        createPage.createNewProject();
        RepositoryPage repositoryPage = new RepositoryPage();
        repositoryPage.createNewCase();
        CreateTestCasePage createTestCasePage = new CreateTestCasePage();
        createTestCasePage.createTestCase();
        Assert.assertTrue(repositoryPage.isCaseCreated());
    }
}
