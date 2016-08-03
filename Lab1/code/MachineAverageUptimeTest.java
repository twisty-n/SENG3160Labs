import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MachineAverageUptimeTest {

    private int uptime;
    private int hours;
    private int expectedResult;
    private TestMachine testMachine;

    @Before
    public void initialize() {
        testMachine = new TestMachine(0, uptime, "");
    }

    public MachineAverageUptimeTest(
        int uptime, 
        int hours,
        int expectedResult) {
            this.uptime = uptime;
            this.hours = hours;
            this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection machines() {
        return Arrays.asList(new Object[][] {
            {4, 2, 2},
            {6, 3, 2},
            {5, 3, 7}
        });
    }

    @Test
    public void testMachineAverageUptimeCalc() {
        assertEquals(testMachine.getMachineAverageUptime(hours), expectedResult);
    }

}