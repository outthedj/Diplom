package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;
import utilities.Retry;

public class LoginTest extends BaseTest{

    private static final String EMAIL = "outthedj@yopmail.com";
    private static final String PASSWORD = "1113444Out!";

    @Test(priority = 1, description = "Test checks login", retryAnalyzer = Retry.class)
    @Description("Check is login successful")
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        ProjectsPage projectsPage = new ProjectsPage();
        Assert.assertFalse(projectsPage.createNewProjectButtonIsEnabled());
    }
}
