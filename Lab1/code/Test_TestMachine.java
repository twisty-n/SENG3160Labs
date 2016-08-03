import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
public class Test_TestMachine {

    private String machineName = "MachineName";

    private TestMachine generateTestMachine() {
        return new TestMachine(123, 456, "AwesomeName");
    }

    private TestMachine generateTestMachine(int machineId, int machineUptime, String designation) {
        return new TestMachine(machineId, machineUptime, designation);
    }

    @Test
    public void testMachineHash() {

        int machineId = 4, key = 4;
        int expectedHash = 2 * machineId * key;
        TestMachine tester = generateTestMachine(machineId, 0, "");
        assertEquals(expectedHash, tester.getMachineHash(key));

    }

    @Test
    public void testGetMachineInfo() {
        List<Integer> noValues = new LinkedList<Integer>();
        TestMachine test = generateTestMachine();

        assertNotNull(test.getMachineInfo());
        assertTrue(test.getMachineInfo().size() == 0);
    }

}