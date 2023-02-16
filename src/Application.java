public class Application {
        public static void main(String[] args) {
                Building b = new Building("Frazier Hall", "2001 Newburg Road | Louisville, Kentucky 40205", 10000,
                                "Occupancy Group A", "BUI1");
                System.out.println("Building Name: " + b.getProjectName());
                System.out.println("Building Address: " + b.getCompleteAddress());
                System.out.println("Building Square Feet: " + b.getTotalSquareFeet());
                System.out.println("Building Occupancy Group: " + b.getOccupancyGroup());
                System.out.println("Building Subgroup: " + b.getSubgroup());
                System.out.println(b.displayData());

                Business bus = new Business("WoW Cafe", "2001 Newburg Road | Louisville, Kentucky 40205", 200,
                                "Business",
                                "BIZ1", 12);
                bus.setNumRentableUnits(20);
                System.out.println("Business Name: " + bus.getProjectName());
                System.out.println("Business Address: " + bus.getCompleteAddress());
                System.out.println("Business Square Feet: " + bus.getTotalSquareFeet());
                System.out.println("Business Occupancy Group: " + bus.getOccupancyGroup());
                System.out.println("Business Subgroup: " + bus.getSubgroup());
                System.out.println("Business Rentable Units: " + bus.getNumRentableUnits());
                System.out.println(bus.displayData());

                Residential res = new Residential("Siena Primo", "2001 Newburg Road | Louisville, Kentucky 40205", 9000,
                                "Residential", "RES1", 4, 3, true);
                res.setNumBedrooms(3);
                res.setNumBathrooms(2);
                res.setLaundryRoom(true);
                System.out.println("Residential Name: " + res.getProjectName());
                System.out.println("Residential Address: " + res.getCompleteAddress());
                System.out.println("Residential Square Feet: " + res.getTotalSquareFeet());
                System.out.println("Residential Occupancy Group: " + res.getOccupancyGroup());
                System.out.println("Residential Subgroup: " + res.getSubgroup());
                System.out.println("Residential Bedrooms: " + res.getNumBedrooms());
                System.out.println("Residential Bathrooms: " + res.getNumBathrooms());
                System.out.println("Residential Laundry Room: " + res.isLaundryRoom());
                System.out.println(res.displayData());

                Apartment apt = new Apartment("Colony Apartments", "3201 Leith Ln | Louisville, Kentucky 40218", 7000,
                                "Apartment", "APT1", 3, 2, true, 12, 1200, true);
                apt.setNumRentableUnits(100);
                apt.setAvgUnitSize(1000);
                apt.setParkingAvailable(true);
                apt.setNumBedrooms(2);
                apt.setNumBathrooms(2);
                apt.setLaundryRoom(true);
                System.out.println("Apartment Details: ");
                System.out.println("Project Name: " + apt.getProjectName());
                System.out.println("Complete Address: " + apt.getCompleteAddress());
                System.out.println("Total Square Feet: " + apt.getTotalSquareFeet());
                System.out.println("Occupancy Group: " + apt.getOccupancyGroup());
                System.out.println("Subgroup: " + apt.getSubgroup());
                System.out.println("Num of Rentable Units: " + apt.getNumRentableUnits());
                System.out.println("Avg Unit Size: " + apt.getAvgUnitSize());
                System.out.println("Parking Available: " + apt.isParkingAvailable());
                System.out.println("Num of Bedrooms: " + apt.getNumBedrooms());
                System.out.println("Num of Bathrooms: " + apt.getNumBathrooms());
                System.out.println("Laundry Room: " + apt.isLaundryRoom());
                System.out.println(apt.displayData());

                Mall mal = new Mall("Green Tree", "124 Clarksville Road", 12330, "Business", "BIZ1", 3, 2, 1000, 4);
                mal.setMedianUnitSize(0);
                mal.setNumParkingSpaces(0);
                mal.setNumRentedUnits(0);
                System.out.println("Apartment Details: ");
                System.out.println("Project Name: " + mal.getProjectName());
                System.out.println("Complete Address: " + mal.getCompleteAddress());
                System.out.println("Total Square Feet: " + mal.getTotalSquareFeet());
                System.out.println("Occupancy Group: " + mal.getOccupancyGroup());
                System.out.println("Subgroup: " + mal.getSubgroup());
                System.out.println("Num of Rentable Units: " + mal.getNumRentableUnits());
                System.out.println("Median Unit Size: " + mal.getMedianUnitSize());
                System.out.println("Parking Spaces: " + mal.getNumParkingSpaces());
                System.out.println("Num of Rented Units: " + mal.getNumRentedUnits());
                System.out.println(mal.displayData());

                SingleFamilyHome home = new SingleFamilyHome("Lonnemann Home", "7812 John Doe Road", 1200,
                                "Residential", "RES1", 4, 3, true, false);
                home.setGarage(false);
                System.out.println("Home Name: " + home.getProjectName());
                System.out.println("Home Address: " + home.getCompleteAddress());
                System.out.println("Home Square Feet: " + home.getTotalSquareFeet());
                System.out.println("Home Occupancy Group: " + home.getOccupancyGroup());
                System.out.println("Home Subgroup: " + home.getSubgroup());
                System.out.println("Home Bedrooms: " + home.getNumBedrooms());
                System.out.println("Home Bathrooms: " + home.getNumBathrooms());
                System.out.println("Home has Laundry Room?: " + home.isLaundryRoom());
                System.out.println("Home has Garage?: " + home.isGarage());
                System.out.println(home.displayData());

        }
}