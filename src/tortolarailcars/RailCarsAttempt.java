/*
 * File Name:   RailCarsAttempt.java
 * Author:      Carissa Richards
 * Date:        April 10, 2020
 * Description: A Java program that calculates the minimum number of rail cars 
 * required to ship a number of automobiles entered by the user. 
 */
package tortolarailcars;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Carissa N. Richards
 */
public class RailCarsAttempt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Display a title/ welcome message
        System.out.println("Welcome to the Railcar Capacity Analysis!");
    // Declare and initialise variables as necessary
         //, maxCapacityPercentage, remainingPercentage;
        int maxRailcarCapacity, minimumRailcars, availableRailcars;
        int vehicleTotal, maximumShipmentCapacity, remainingVehicles, 
                additionalCapacity;
        
    // Create a Scanner object named 'input' to accept user input
        Scanner input = new Scanner(System.in);
        
    /** Prompt the user to enter the name of the railway company 
     * (Store the input in an appropriate variable) */
        System.out.print("Enter the name of the railway company >> ");
        String companyName = input.nextLine();
        
    // Flush the keyboard buffer to clear previously entered user input 
        //input.nextLine();
        
    /** Prompt the user to enter the number of vehicles to be shipped 
     * (Store the input in an appropriate variable)*/
        System.out.print("Enter the number of automobiles to be shipped >> ");
        vehicleTotal = input.nextInt();
        
    // Flush the keyboard buffer to clear previously entered user input
        input.nextLine();    
     
    /** Validate the data entered by the user to ensure a valid value between
     * 36 and 48 inclusive. 
     * (Store the new user input in an appropriate variable)
     * 
     */
    // Validation statement for rail car maximum capacity
     switch(input.nextInt()) {
         case 36:
             System.out.print("Enter the maximum capacity of one rail car "
                + "(Number between 36 and 48) >> ");
             maxRailcarCapacity = input.nextInt(); 
             break;
         case 37:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 38:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 39:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 40:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 41:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 42:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 43:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 44:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 45:
             maxRailcarCapacity = input.nextInt(); 
             break;
         case 46:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 47:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         case 48:
             //maxRailcarCapacity = input.nextInt(); 
             break;
         default:
             // Flush the keyboard buffer to clear previously entered user input
             input.nextLine();
             // Prompt user to re-enter a valid maximum rail car capacity
             System.out.println("Please re-enter the maximum capacity of one rail "
                + "car: (Number between 36 and 48) >> ");
             /* Create a loop that does not allow the user to proceed until a 
             valid maximum rail car capacity has been entered */
             
     }
       
    /** Prompt the user to enter the maximum number of vehicles that can be 
     * carried by one rail car (minimum = 36, maximum = 48)
     */
         
    
        maxRailcarCapacity = input.nextInt(); 
    // Flush the keyboard buffer to clear previously entered user input
        input.nextLine();
            
    /** Prompt the user to enter the number of rail cars available at the train 
     * yard */
        System.out.print("Enter number of railcars available at train yard >> ");
        availableRailcars = input.nextInt();
    
        
    // Calculate and display: 
    /** The minimum number of rail cars required to carry all the vehicles
     * Minimum number of rail cars required will be calculated by dividing 
     * the total number of automobiles to be shipped (value stored in 
     * vehicleTotal) by the maximum rail car capacity (value stored in 
     * maxRailcarCapacity).
     * Use the 'ceiling' of the Math class to round to nearest integer 
     * greater than the value. 
     * Store the minimum number of rail cars in variable 'minimumRailcars'
     * (int)(Math.ceil
     */
    	minimumRailcars = (vehicleTotal / maxRailcarCapacity);
        
    /** The number of vehicles that would be shipped if the available rail cars 
     * were filled. This value will be calculated by multiplying the number of 
     * available rail cars (availableRailcars) by the maximum capacity of each 
     * rail car (maxRailcarCapacity)
     * Store the value in variable 'maximumShipmentCapacity'
     */
    	maximumShipmentCapacity = availableRailcars * maxRailcarCapacity;
        
    /** The percentage of all the vehicles on the train that this represents
     * Format maximumShipmentCapacity as a percentage 
     * Store the value in variable 'maxCapacityPercentage'
     */
    	//NumberFormat percentage = NumberFormat.getPercentInstance();
        //maxCapacityPercentage = percentage.format(maximumShipmentCapacity/100);
        
    /** The number of vehicles that would be left behind as well as the 
     * percentage that this represents
     * Store the number of left behind vehicles in variable 'remainingVehicles' */
        remainingVehicles = vehicleTotal - maximumShipmentCapacity;
        //remainingPercentage = percentage.format(remainingVehicles/100);
    
    /** If no vehicles left behind, the additional vehicles that could be carried 
     * by the rail cars
     * Use if-else statement to determine whether there are remaining vehicles
     * This value will be calculated by subtracting the number of vehicles to be 
     * shipped (vehicleTotal) from the maximum shipment capacity 
     * (maximumShipmentCapacity)
     * Store the value in variable 'additionalCapacity'
     */
        if(remainingVehicles==0) {
            additionalCapacity = 0;
        }
        else
            additionalCapacity = maximumShipmentCapacity - vehicleTotal;
    //Output the results
    	System.out.println("A minimum of " + minimumRailcars + 
                " rail cars are required to ship every automobile in the yard.");
    	System.out.println(maximumShipmentCapacity + " automobiles ()  would be shipped.");
    	System.out.println(remainingVehicles + " automobiles (" + 
                (remainingVehicles) + ")  would be left behind.");
    	System.out.println("There would be room for an extra " + 
                additionalCapacity + " automobiles on the rail cars.");
    }
    
}
