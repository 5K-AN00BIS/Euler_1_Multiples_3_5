/*
    Ryan Bachman

    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Multiples
{
    public static void main(String[] args)
    {
        // Variable that will be held to get the sum.
        int sum = 0;

        // MULTIPLES BELOW 10 - Can be made into a function that takes in an int as an argument so they number can be dynamic.
        // For loop to run however many times as required by the assignment.
        System.out.print("Multiples of 10: ");
        for (int i = 1; i < 10; i++)
        {
            // If modulus of i for 3 or 5 is equal to 0, that makes it a multiple of 3 or 5.
            if (i % 3 == 0 || i % 5 == 0)
            {
                // Display the number ot the user.
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        // Output the sum to the user.
        System.out.println("\nSum of these multiples is " + sum + ".\n");
        sum = 0;
        // Reset the value of sum for 1000 multiples.

        // MULTIPLES BELOW 1000 - Can be made into a function that takes in an int as an argument so they number can be dynamic.
        // For loop to run however many times as required by the assignment.
        System.out.print("Multiples of 1,000: ");
        for (int i = 1; i < 1000; i++)
        {
            // If modulus of i for 3 or 5 is equal to 0, that makes it a multiple of 3 or 5.
            if (i % 3 == 0 || i % 5 == 0)
            {
                // Display the number ot the user.
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        // Output the sum to the user.
        System.out.println("\nSum of these multiples is " + sum + ".");
        sum = 0;
    }
}