public class Business extends Building {
    protected int numRentableUnits;

    public Business() {
        super();
        numRentableUnits = 0;
    }

    public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numRentableUnits) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numRentableUnits = numRentableUnits;
    }

    public void draw() {
        System.out.println("Drawing code for Business");
    }

    public String displayData() {
        StringBuilder sb = new StringBuilder(super.displayData());
        sb.append("\nNumber of Rentable Units: " + numRentableUnits);
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayData();
    }

    public int getNumRentableUnits() {
        return numRentableUnits;
    }

    public void setNumRentableUnits(int numRentableUnits) {
        this.numRentableUnits = numRentableUnits;
    }
}
