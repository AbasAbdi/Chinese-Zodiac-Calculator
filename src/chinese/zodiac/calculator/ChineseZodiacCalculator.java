/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinese.zodiac.calculator;
import java.util.Scanner;
/**
 *
 * @author 21422705
 */
public class ChineseZodiacCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       // requesting user input 
       System.out.println("Welcome to the Chinease Zodiac Calculator!\n");
       System.out.println("Please enter the year:\n");
       //storing user input in the year variable 
       int year = input.nextInt();
       // doing the math and storing the result in the zodiac variable
       int Zodiac = year % 12;   
       
       // using switch statement to determin the correct output for the user
       switch(Zodiac) {
        case 0: 
            System.out.println("\nIt is the year of the Monkey!\n");
            break;
        case 1:
            System.out.println("\nIt is the year of the Rooster!\n");
            break;
        case 2:
            System.out.println("\nIt is the year of the Dog!\n");
            break;
        case 3:
            System.out.println("\nIt is the year of the Pig!\n");
            break;
        case 4:
            System.out.println("\nIt is the year of the Rat!\n");
            break;
        case 5:
            System.out.println("\nIt is the year of the Ox!\n");
            break;
        case 6:
            System.out.println("\nIt is the year of the Tiger!\n");
            break;
        case 7:
            System.out.println("\nIt is the year of the Rabbit!\n");
            break;
        case 8:
            System.out.println("\nIt is the year of the Dragon!\n");
            break;
        case 9:
            System.out.println("\nIt is the year of the Snake!\n");
            break;
        case 10:
            System.out.println("\nIt is the year of the Horse!\n");
            break;
        case 11:
            System.out.println("\nIt is the year of the Sheep!\n");
            break;
        
       }
        
    }
    
}
