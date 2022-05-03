package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RepositoryPage;
import utilities.Retry;

public class LogoutTest extends BaseTest{

    @Test(priority = 2, description = "Test checks logout", retryAnalyzer = Retry.class)
    @Description("Check is logout successful")
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        RepositoryPage repositoryPage = new RepositoryPage();
        repositoryPage.makeLogout();
        Assert.assertTrue(loginPage.wasLogoutSuccessful());

    }
}
