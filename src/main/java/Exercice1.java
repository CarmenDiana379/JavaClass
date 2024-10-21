/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carmendiana
 */
import java.util.Scanner;

public class Exercice1 {
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please type a value between 1 and 25 inclusive: ");
        int myNumber = scanner.nextInt ();
        while (myNumber <0 || myNumber >25) {
            System.out.println ("Please type a value between 1 and 25 inclusive: ");
            myNumber = scanner.nextInt ();
        }
        
        if (myNumber % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("the number is odd!");
        }
        
        
    if (myNumber > 0) {
    System.out.println("The number is positive.");
} else if (myNumber <0) {
    System.out.println("The number is negative.");
} else {
    System.out.println ("The number is zero.");
}
    }
}
    

