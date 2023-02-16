public class Building {
    protected String projectName;
    protected String completeAddress;
    protected double totalSquareFeet;
    protected String occupancyGroup;
    protected String subgroup;

    public Building() {
        this.projectName = "";
        this.completeAddress = "";
        this.totalSquareFeet = 0.0;
        this.occupancyGroup = "";
        this.subgroup = "";
    }

    public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
            String subgroup) {
        this.projectName = projectName;
        this.completeAddress = completeAddress;
        this.totalSquareFeet = totalSquareFeet;
        this.occupancyGroup = occupancyGroup;
        this.subgroup = subgroup;
    }

    public void draw() {
        System.out.println("Drawing code for Building");
    }

    public String displayData() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nProject Name: " + projectName);
        sb.append("\nComplete Address: " + completeAddress);
        sb.append("\nTotal Square Feet: " + totalSquareFeet);
        sb.append("\nOccupancy Group: " + occupancyGroup);
        sb.append("\nSubgroup: " + subgroup);
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayData();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public double getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(double totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public String getOccupancyGroup() {
        return occupancyGroup;
    }

    public void setOccupancyGroup(String occupancyGroup) {
        this.occupancyGroup = occupancyGroup;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

}
