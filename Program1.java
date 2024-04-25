class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // your code goes here
    
    
  }
}
public class CarbonFootprintCalculator {

    public static void main(String[] args) {
        // Data for different activities
        double milesDriven = 300; // miles
        double milesFlown = 1500; // miles

        // Calculate carbon footprint for driving
        double carFootprint = calculateCarbonFootprint(milesDriven, 0.404); // Average CO2 emitted per mile by car

        // Calculate carbon footprint for flying
        double flightFootprint = calculateCarbonFootprint(milesFlown, 0.115); // Average CO2 emitted per mile by airplane

        // Display results
        displayFootprint("driving", carFootprint);
        displayFootprint("flying", flightFootprint);
    }

    // Method to calculate carbon footprint
    public static double calculateCarbonFootprint(double miles, double emissionFactor) {
        return miles * emissionFactor;
    }

    // Method to display the carbon footprint
    public static void displayFootprint(String activity, double footprint) {
        System.out.println("The carbon footprint for " + activity + " is: " + footprint + " kg of CO2.");
    }
}