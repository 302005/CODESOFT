import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Currency Converter");
        System.out.print("Enter the amount in USD: $");
        double usdAmount = scanner.nextDouble();
        
        // Define the exchange rate for the currency you want to convert to (e.g., EUR to USD).
        double exchangeRate = 0.85; // 1 USD to EUR
        
        // Convert USD to the target currency
        double targetAmount = usdAmount * exchangeRate;
        
        System.out.println("Converted amount: " + targetAmount + " EUR");
        
        scanner.close();
    }
}