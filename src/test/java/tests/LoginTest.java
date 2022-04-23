package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectsPage;

public class LoginTest extends BaseTest{

    private static final String EMAIL = "outthedj@yopmail.com";
    private static final String PASSWORD = "1113444Out!";

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        ProjectsPage projectsPage = new ProjectsPage();
        Assert.assertTrue(projectsPage.createNewProjectButtonIsEnabled());
    }
}
