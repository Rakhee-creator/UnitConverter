import java.util.Scanner;  // Import Scanner for user input

   public class UnitConverter {
        // Conversion methods
        static double convertKmToMiles(double km) {
            return km * 0.621371;
        }

        static double convertMilesToKm(double miles) {
            return miles * 1.60934;
        }

        static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }

        static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }

        static double convertKgToPounds(double kg) {
            return kg * 2.20462;
        }

        static double convertPoundsToKg(double pounds) {
            return pounds * 0.453592;
        }

       
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.println("Welcome to Unit Converter! Choose an option:");
                System.out.println("1. Kilometers to Miles");
                System.out.println("2. Miles to Kilometers");
                System.out.println("3. Celsius to Fahrenheit");
                System.out.println("4. Fahrenheit to Celsius");
                System.out.println("5. Kilograms to Pounds");
                System.out.println("6. Pounds to Kilograms");
        
                System.out.print("Enter your choice (1-6): ");
                int choice = scanner.nextInt();
        
                System.out.print("Enter value to convert: ");
                double value = scanner.nextDouble();
        
                double convertedValue = 0;
        
                switch (choice) {
                    case 1: convertedValue = UnitConverter.convertKmToMiles(value); break;
                    case 2: convertedValue = UnitConverter.convertMilesToKm(value); break;
                    case 3: convertedValue = UnitConverter.convertCelsiusToFahrenheit(value); break;
                    case 4: convertedValue = UnitConverter.convertFahrenheitToCelsius(value); break;
                    case 5: convertedValue = UnitConverter.convertKgToPounds(value); break;
                    case 6: convertedValue = UnitConverter.convertPoundsToKg(value); break;
                    default: System.out.println("Invalid choice. Please restart the program.");
                }
        
                if (choice >= 1 && choice <= 6) {
                    System.out.println("Converted Value: " + convertedValue);
                }
        
                scanner.close();
            }
        }
        