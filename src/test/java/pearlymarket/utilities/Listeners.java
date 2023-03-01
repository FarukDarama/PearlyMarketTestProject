package pearlymarket.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName());
        try {
            ReusableMethods.getScreenshot("Test-Case-FAIL :"+result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName());
    }
}
