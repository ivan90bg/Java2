
package computer;

public class Computer {
    
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 500;
    }

    public Computer(double processTact, double memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public double getProcessTact() {
        return processTact;
    }

    public double getMemory() {
        return memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    
    
}
