import java.util.*;

public class TestMachine {

    private int machineId;
    private int machineUptime;
    private String machineDesignation;

    public TestMachine(int machineId, int machineUptime, String designation) {
        this.machineId = machineId;
        this.machineUptime = machineUptime;
        this.machineDesignation = machineDesignation;
    }

    public int getMachineId() {
        return this.machineId;
    }

    public int getMachineHash(int key) {
        return 2 * key * machineId;
    }

    public String getMachineDesignation() {
        return this.machineDesignation + "::" + machineId;
    }

    public List<Integer> getMachineInfo() {
        return new LinkedList<Integer>();
    }

    public int getMachineAverageUptime(int hours) {
        if (hours == 0) throw new NumberFormatException();
        return machineUptime / hours;
    }

}