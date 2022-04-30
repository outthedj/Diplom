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
        System.out.println("Test ".concat(iTestResult.getName()).concat(" started"));
    }

    @Attachment
    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        makeScreenshot ();
        AllureService allureService = new AllureService();
        allureService.takeScreenshot(driver);
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
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}