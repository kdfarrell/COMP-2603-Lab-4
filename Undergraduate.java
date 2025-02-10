public class Undergraduate extends Student {
    private String minor;
    private String major;
    private int credits;
    
    public Undergraduate() {
        calculateFees();
    }
    
    // Accessors
    public String getMinor() {
        return this.minor;
    }
    
    public String getMajor() {
        return this.major;
    }
    
    public int getCredits() {
        return this.credits;
    }
    
    // Mutators
    public void setMinor(String minor) {
        this.minor = minor;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public void calculateFees() {
        double newFees = credits * 200.0;
        super.setFees(newFees);
    }
    
    public String toString() {
        String s = super.toString();
        s = s + "\n Minor: " + getMinor() + " Major: " + getMajor() +
            " Credits: " + getCredits()+ "\n";
        return s;
    }
}