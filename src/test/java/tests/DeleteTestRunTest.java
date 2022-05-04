package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Retry;

public class DeleteTestRunTest extends BaseTest{

    @Test(priority = 1, description = "Test checks creating new test run", retryAnalyzer = Retry.class)
    @Description("Test checks creating new test plan")
    public void isNewTestPlanCreated() {
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
        TestRunsPage testRunsPage = new TestRunsPage();
        testRunsPage.openTestRunMenu();
        testRunsPage.createTestRun();
        testRunsPage.deleteTestRun();
        Assert.assertTrue(testRunsPage.wasTestRunDeleted());
    }
}
