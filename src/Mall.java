public class Mall extends Business {
    private int numRentedUnits;
    private double medianUnitSize;
    private int numParkingSpaces;

    public Mall() {
        super();
        numRentedUnits = 0;
        medianUnitSize = 0.0;
        numParkingSpaces = 0;
    }

    public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
        this.numRentedUnits = numRentedUnits;
        this.medianUnitSize = medianUnitSize;
        this.numParkingSpaces = numParkingSpaces;
    }

    public int getNumRentedUnits() {
        return numRentedUnits;
    }

    public void setNumRentedUnits(int numRentedUnits) {
        this.numRentedUnits = numRentedUnits;
    }

    public double getMedianUnitSize() {
        return medianUnitSize;
    }

    public void setMedianUnitSize(double medianUnitSize) {
        this.medianUnitSize = medianUnitSize;
    }

    public int getNumParkingSpaces() {
        return numParkingSpaces;
    }

    public void setNumParkingSpaces(int numParkingSpaces) {
        this.numParkingSpaces = numParkingSpaces;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for Mall");
    }

    @Override
    public String displayData() {
        StringBuilder sb = new StringBuilder(super.displayData());
        sb.append("\nNumber of Rentable Units: " + numRentableUnits);
        sb.append("\nNumber of Rented Units: " + numRentedUnits);
        sb.append("\nMedian Unit Size: " + medianUnitSize);
        sb.append("\nNumber of Parking Spaces: " + numParkingSpaces);
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayData();
    }
}
