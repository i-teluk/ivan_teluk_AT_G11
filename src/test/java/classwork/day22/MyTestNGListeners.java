package classwork.day22;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListeners implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("Success");
        Result rslt = new Result(1);
        String caseId = result.getMethod().getDescription();
        TestRailReporter.reportResult("2366", caseId, rslt);
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Fail");
        Result rslt = new Result(5);
        String caseId = result.getMethod().getDescription();
        TestRailReporter.reportResult("2366", caseId, rslt);
    }

}
