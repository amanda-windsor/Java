// Programmer: Amanda Windsor 12197877
// File: Main.java
// Date: November 17, 2022
// Purpose: COIT11222 week02 practical question 2 T322
/**
You are to write an application that asks the user to enter one integer, obtains it from the user, and then displays the square of the number. It must then display whether the square of the number is greater than, equal to, or less than 100. 
An example of the output that would be displayed if the user entered the number 5 is shown below (the 5 on the first line is shown in bold and highlighted as it was input by the user):
Output
Enter an integer: 5
Number entered is: 5
The number squared is 25
5 squared is less than 100
* 
* 
1.	Create a Scanner object to read input from the user (assign it to input variable)
2.	Prompt the user for an integer
3.	Assign the value read from the user using the scanner object to a variable called number
4.	Display the number read

*/

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        // Enter an integer (and display) its value
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Number entered is: " + number);
        
        // Calculate (and display) the square of the integer entered - save the result in squared
        int squared = (number * number);
        System.out.println(number + " squared is " + squared + "!");

        // Display whether the square is greater than, less than or equal to 100
        if(squared == 100)
            System.out.println(squared + " is equal to 100");
        else if(squared < 100)
            System.out.println(squared + " is less than 100");
        else
            System.out.println(squared + " is greater than 100");
        
    }
    
}
