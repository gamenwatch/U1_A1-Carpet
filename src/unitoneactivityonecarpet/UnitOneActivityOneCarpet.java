/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitoneactivityonecarpet;

/**
 *Jacob Lacey
 *19 Sept 2018
 *To Calculate and Output/Print the Cost of a Carpet to Cover a Specific Sized Room
 */
public class UnitOneActivityOneCarpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Size of room
        double width = 8.50;//m
        double length = 6.00;//m
        //price per meter squared
        double pricePerM = 19.95; //m2
        //final cost
        double cost = 0.00;
        
        
        //algorithm to find the total cost
        cost=(width*length)*19.95;
        
        //print the answer
        System.out.println("The total cost of the required carpet would be $"+cost+".");
    }
    
}
