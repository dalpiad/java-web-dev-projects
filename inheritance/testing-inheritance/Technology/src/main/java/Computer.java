public class Computer {
    private String make;
    private String model;
    private String cpu;
    private int memory;

    public Computer (String aMake, String aModel, String aCpu, int aMemory) {
        make = aMake;
        model = aModel;
        cpu = aCpu;
        memory = aMemory;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
