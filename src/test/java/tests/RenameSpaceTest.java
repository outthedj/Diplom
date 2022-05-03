package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.SettingsPage;
import pages.WorkSpacePage;
import utilities.Retry;

public class RenameSpaceTest extends BaseTest{

    @Test(priority = 1, description = "Test checks space renaming", retryAnalyzer = Retry.class)
    @Description("Test checks space renaming")
    public void renameSpaceTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        ProjectsPage projectsPage = new ProjectsPage();
        projectsPage.clickOnWorkSpaceButton();
        WorkSpacePage workSpacePage = new WorkSpacePage();
        workSpacePage.openSettingsPage();
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.renameWorkSpace();
        Assert.assertEquals(workSpacePage.checkingRenamingOfWorkspace(),"666");

    }
}
