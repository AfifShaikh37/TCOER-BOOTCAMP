 import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of electricity units consumed: ");
        int units = scanner.nextInt();
        double bill = 0.0;

        
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 350) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.25);
        } else if (units <= 600) {
            bill = (50 * 0.50) + (100 * 0.75) + (200 * 1.25) + ((units - 350) * 1.50);
        } else {
            // For units above 600
            bill = (50 * 0.50) + (100 * 0.75) + (200 * 1.25) + (250 * 1.50) + ((units - 600) * 1.50);
        }

        
        double serviceCharge = bill * 0.20;
        double totalBill = bill + serviceCharge;

        
        System.out.println("Base bill amount: ₹" + String.format("%.2f", bill));
        System.out.println("Service charge (20%): ₹" + String.format("%.2f", serviceCharge));
        System.out.println("Total electricity bill: ₹" + String.format("%.2f", totalBill));

        scanner.close();
    }
}
