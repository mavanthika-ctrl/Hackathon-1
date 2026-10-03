mport java.util.Scanner;

public class WasteManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== 3a) DATA TYPES =====
        int vehicleNumber = 101;
        double wasteCollected = 125.5;
        int collectionPoints = 5;
        char vehicleStatus = 'A';

        System.out.println("===== VEHICLE DETAILS =====");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);


        // ===== 3b) IF-ELSE CONDITION =====
        System.out.println("\n===== WASTE COLLECTION STATUS =====");

        System.out.print("Enter waste collected in kg: ");
        double waste = sc.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }


        // ===== 3c) METHOD =====
        System.out.println("\n===== TOTAL WASTE =====");

        System.out.print("Enter waste at  1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste at  2: ");
        double point2Waste = sc.nextDouble();

        double total = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + total + " kg");

        sc.close();
    }

    // Method for calculating total waste
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}