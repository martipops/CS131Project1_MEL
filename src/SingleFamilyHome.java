public class SingleFamilyHome extends Residential {
    private boolean garage;

    public SingleFamilyHome() {
        super();
        garage = false;
    }

    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
                laundryRoom);
        this.garage = garage;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void draw() {
        System.out.println("Drawing code for Single Family Home.");
    }

    @Override
    public String displayData() {
        StringBuilder sb = new StringBuilder(super.displayData());
        sb.append("\nGarage: " + garage);
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayData();
    }

}
