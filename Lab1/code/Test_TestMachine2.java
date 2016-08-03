import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
public class Test_TestMachine2 {

    private String machineName = "MachineName";

    private TestMachine generateTestMachine() {
        return new TestMachine(123, 456, "AwesomeName");
    }

    private TestMachine generateTestMachine(int machineId, int machineUptime, String designation) {
        return new TestMachine(machineId, machineUptime, designation);
    }

    @Test
    public void testGetMachineDesignation() {
        String machineDesignation = "desg"; int machineId = 4;
        String designationResult = machineDesignation + "::" + machineId;
        
        assertEquals(designationResult, generateTestMachine(machineId, 0, machineDesignation)
            .getMachineDesignation());

    }

    @Test(expected = ArithmeticException.class)
    public void testAvgUptimeFailsCorrectly() {
        TestMachine test = generateTestMachine();
        System.out.println("Getting machine uptime with '0' param");
        test.getMachineAverageUptime(0);
    }

}