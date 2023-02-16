public class Residential extends Building {
    protected int numBedrooms;
    protected int numBathrooms;
    protected boolean laundryRoom;

    public Residential() {
        super();
        numBedrooms = 0;
        numBathrooms = 0;
        laundryRoom = false;
    }

    public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.laundryRoom = laundryRoom;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for Residential.");
    }

    @Override
    public String displayData() {
        StringBuilder sb = new StringBuilder(super.displayData());
        sb.append("\nNum of Bedrooms: " + numBedrooms);
        sb.append("\nNum of Bathrooms: " + numBathrooms);
        sb.append("\nLaundry Room: " + laundryRoom);
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayData();
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public boolean isLaundryRoom() {
        return laundryRoom;
    }

    public void setLaundryRoom(boolean laundryRoom) {
        this.laundryRoom = laundryRoom;
    }
}
