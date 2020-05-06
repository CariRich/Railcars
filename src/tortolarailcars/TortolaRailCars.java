/*
 * File Name:   TortolaRailCars.java
 * Author:      Carissa Richards
 * Date:        April 10, 2020
 * Description: A Java program that calculates the minimum number of rail cars 
 * required to ship a number of automobiles entered by the user. 
 */
package tortolarailcars;

/**
 *
 * @author Carissa N. Richards
 */
public class TortolaRailCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display a title/ welccome message
        System.out.println("Welcome to the Railcar Capacity Analysis!");
        
        // Declare and initialise variables as necessary
        String companyName = "Default Company";
        int maxRailcarCapacity = 36, minimumRailcars = 1, availableRailcars = 1;
        int vehicleTotal, maximumShipmentCapacity, maxCapacityPercentage;
        
        
        // Create a Scanner object named 'input' to accept user input
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt the user to enter: 
        // The name of the railway company (Store the input in an appropriate variable)
        System.out.print("Enter the name of the railway company: ");
        companyName = input.nextLine();
        
        // Flush the keyboard buffer to clear the last user input entered
        input.nextLine();
        
        /* // The number of vehicles to be shipped (Store the input in an appropriate variable)
        System.out.print("Enter the number of automobiles to be shipped: ");
        vehicleTotal = input.nextInt();
         */
        
        // The maximum number of vehicles that can be carried by one rail car (minimum = 36, maximum = 48)
        /** Validate the data entered by the user to ensure a valid value between 
         * 36 and 48 inclusive. Use an if-else statement to check for valid condition.
         */        
        // (Store the new user input in an appropriate variable)
        System.out.print("Enter the maximum capacity of one rail car: (Number between 36 and 48) ");
        maxRailcarCapacity = input.nextInt();
        
        if(maxRailcarCapacity>=36 && maxRailcarCapacity <=48){
            maxRailcarCapacity = input.nextInt();
        }
        else System.out.println("Please re-enter the maximum capacity of one rail "
                + "car: (Number between 36 and 48) ");
        
        // The number of railcars available at the train yard
        // Flush the keyboard buffer to clear the last integer entered
        input.nextLine();
        System.out.print("Enter the number of railcars available at the train yard: ");
        availableRailcars = input.nextInt();
        
        // Calculate and display: 
        // The minimum number of railcars required to carry all the vehicles
        /** Minimum number of rail cars will be calculated by dividing the total 
         * number of automobiles to be shipped by the number of available rail cars 
         * at the largest rail car capacity
         * Store the minimum number in variable 'minimumRailcars'
         */
        
        // The number of vehicles that would be shipped if the available railcars were filled
        /**This value will be calculated by multiplying the minimum number of 
         * rail cars (minimumRailcars) by the maximum capacity of each rail car (maxRailcarCapacity)
         * Store the value in variable 'maximumShipmentCapacity'
         */
        
        // The percentage of all the vehicles on the train that this represents
        /**Format maximumShipmentCapacity as a percentage 
         * Store the value in variable 'maxCapacityPercentage'
         */
        // The number of vehicles that would be left behind as well as the percentage that this represents
        // If no vehicles left behind, the additional vehicles that could be carried by the railcars
    }
    
}
