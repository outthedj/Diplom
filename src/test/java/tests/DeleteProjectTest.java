package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Retry;

public class DeleteProjectTest extends BaseTest{

    @Test(priority = 1, description = "Test checks deleting project", retryAnalyzer = Retry.class)
    @Description("Check is deleting project works correct")
    public void isDeletedProjectDisappears() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        ProjectsPage projectsPage = new ProjectsPage();
        projectsPage.createNewProjectButtonClick();
        CreatePage createPage = new CreatePage();
        createPage.createNewProject();
        RepositoryPage repositoryPage = new RepositoryPage();
        repositoryPage.clickOnProjectButton();
        projectsPage.clickOnProjectDropDown();
        Assert.assertTrue(projectsPage.checkingNoProjects());

    }
}
