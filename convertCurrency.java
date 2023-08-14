import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
             
            		
		 Scanner scanner = new Scanner(System.in);
         
             System.out.println(" currencies: EUR,USD,  GBP, INR");
             System.out.print("Enter the currency  (USD, EUR, GBP, INR): ");
             String fromCurrency = scanner.next().toUpperCase();
             if (!isValidCurrency(fromCurrency)) {
                 System.out.println(" Please enter a valid currency.");
                 return;
             }
             System.out.print("Enter the amount in Rupees: ");
             double amount = scanner.nextDouble();
             double eurToInrRate = 90.691182;
             double usdToInrRate = 82;
			double gbpToInrRate = 105.28201 ;
			double convertedAmount = convertCurrency(fromCurrency, amount, usdToInrRate, eurToInrRate, gbpToInrRate);
             System.out.println("Converted amount: " + convertedAmount);

	}
	public static boolean isValidCurrency(String currency) {
        return currency.equals("USD") || currency.equals("EUR") || currency.equals("GBP") || currency.equals("INR");
    }

    public static double convertCurrency(String fromCurrency, 
    		double amount, 
    		double usdToInrRate, 
    		double eurToInrRate, 
    		double gbpToInrRate) {
        double convertedAmount = 0.0;

        switch (fromCurrency) {
            case "USD":
                convertedAmount = amount * usdToInrRate;
                break;
            case "EUR":
                convertedAmount = amount * eurToInrRate;
                break;
            case "GBP":
                convertedAmount = amount * gbpToInrRate;
                break;
            case "INR":
                convertedAmount = amount;
                break;
            default:
                System.out.println("Invalid input currency.");
        }

        return convertedAmount;
    }
}


