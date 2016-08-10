import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args)
    {
        System.out.println("\n Running test...\n");
        Result r = JUnitCore.runClasses(TestMachinery.class);
        
        for(Failure f : r.getFailures()) {
            System.out.println(f.toString());
        }
        
        System.out.println(
                (r.wasSuccessful() ? 
                    "All tests passed" : "All tests failed"));
    }
}