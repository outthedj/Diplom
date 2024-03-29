package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;
import staticdata.WebTimeouts;
import staticdata.WebUrls;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = WebTimeouts.ELEMENT_LOAD_TIMEOUT;
        Configuration.baseUrl = WebUrls.LOGIN_URL;
        Configuration.startMaximized = true;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }
}