package Week2;

import java.util.Scanner;

public class PositiveOrNegativeNumber
{
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any number : ");
            int number = sc.nextInt();

            if (number >= 0)
            {
                System.out.println("Entered number is positive.");
            }
            else
                System.out.println("Entered number is negative.");
        }
    }
