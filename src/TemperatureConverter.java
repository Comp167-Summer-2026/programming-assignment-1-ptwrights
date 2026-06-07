import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        if ((unit.equals("C") || unit.equals("c"))) {
            return (temperature * 9.0/5.0) + 32.0;
        } else if ((unit.equals("F") || unit.equals("f"))) {
            return (temperature - 32.0) * 5.0 / 9.0;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double temperature;
        String unit;
        boolean continuous = true;

        while (continuous) {
            System.out.print("Enter temperature value or type 'stop' to quit: ");

            if (scnr.hasNextDouble()) {
                temperature = scnr.nextDouble();
                System.out.print("Enter the unit (C or F): ");
                unit = scnr.next();

                // Keep prompting until a valid unit is given
                while (!unit.equals("C") && !unit.equals("c") && !unit.equals("F") && !unit.equals("f")) {
                    System.out.println("Error: Invalid unit entered.");
                    System.out.print("Enter the unit (C or F): ");
                    unit = scnr.next();
                }

                if (unit.equals("C") || unit.equals("c")) {
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f\u00B0C is equal to %.2f\u00B0F%n", temperature, result);
                } else {
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f\u00B0F is equal to %.2f\u00B0C%n", temperature, result);
                }

            } else {
                String userInput = scnr.next();
                if (userInput.equals("Stop") || userInput.equals("stop")) {
                    continuous = false;
                    System.out.println("Program exits gracefully.");
                } else {
                    System.out.println("Error: Invalid temperature input.");
                }
            }
        }
    }
}
