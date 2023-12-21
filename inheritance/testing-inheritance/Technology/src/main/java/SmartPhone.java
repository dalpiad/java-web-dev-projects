public class SmartPhone extends Computer {

    private double screenSizeInches;

    public SmartPhone(String aMake, String aModel, String aCpu, int aMemory, double aScreenSizeInches) {
        super(aMake, aModel, aCpu, aMemory);
        screenSizeInches = aScreenSizeInches;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }
}
