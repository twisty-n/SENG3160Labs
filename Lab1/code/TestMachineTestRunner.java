import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMachineTestRunner {

    public static void main(String[] args) {
        Result testResult = JUnitCore.runClasses(TestMachineSuite.class);
        for (Failure f : testResult.getFailures()) {
            System.out.println(f.toString() + "\n");
        }

        System.out.println("Test suite passed: " + testResult.wasSuccessful());
    }

}