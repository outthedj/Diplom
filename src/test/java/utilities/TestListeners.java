package utilities;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    WebDriver driver;
    WebDriverRunner webDriverRunner;

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Attachment
    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test ".concat(iTestResult.getName()).concat(" started"));


        public byte[] takeScreenshot(WebDriverRunner.getWebDriver()) {
            TakesScreenshot screenShot = ((TakesScreenshot) webDriverRunner);
            return screenShot.getScreenshotAs(OutputType.BYTES);
        }

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        makeScreenshot ("Success");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] makeScreenshot(String name) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}