public class Laptop extends Computer {

    private double batteryLifeHrs;

    private double weightLbs;
    public Laptop(String aMake, String aModel, String aCpu, int aMemory, double aBatteryLifeHrs, double aWeightLbs) {
        super(aMake, aModel, aCpu, aMemory);
        batteryLifeHrs = aBatteryLifeHrs;
        weightLbs = aWeightLbs;
    }

    public double getBatteryLifeHrs() {
        return batteryLifeHrs;
    }

    public void setBatteryLifeHrs(double batteryLifeHrs) {
        this.batteryLifeHrs = batteryLifeHrs;
    }

    public double getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(double weightLbs) {
        this.weightLbs = weightLbs;
    }
}
