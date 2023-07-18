package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int failures = 0;
    int limit = 3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(failures<limit) {
            failures++;
            return true;
        }
        return false;
    }
}
