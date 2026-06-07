import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        // TODO: students implement this
        if ((unit.equals("C") || unit.equals("c"))) {
            return (temperature * 9.0/5.0) + 32.0;
        } else if ((unit.equals("F") || unit.equals("f"))) {
            return (temperature - 32.0) * 5.0 / 9.0;
        }

        return 0.0;
    }

    public static void main(String[] args) {
        // TODO: students implement this
        Scanner scnr = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        double temperature;
        String unit;
        boolean continuous = true;

        while (continuous) {
            System.out.print("Enter temperature value value and its unit or stop to quit");

            if (scnr.hasNextDouble()) {
                temperature = scnr.nextDouble();
                unit = scnr.next();

                if (unit.equals("C") || unit.equals("c")) {
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, result);
                } else if (unit.equals("f") || unit.equals("F")){
                    double result = convertTemperature(temperature, unit);
                    System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, result);
                } else {
                    System.out.println("Error: Unrecognizable unit.");
                }
            } else {
                String userInput = scnr.next();
                if (userInput.equals("Stop") || userInput.equals("stop")) {
                    continuous = false;
                    System.out.println("Program exits gracefully.");
                } else {
                    System.out.println("Error: Enter valid temperature.");
                }
            }
        }
    }

}
