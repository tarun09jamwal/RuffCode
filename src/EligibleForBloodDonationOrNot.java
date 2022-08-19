
import java.util.Scanner;

public class EligibleForBloodDonationOrNot
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your weight : ");
        int weight = sc.nextInt();
        if (age>=18)
        {
            if (weight>=50)
            {
                System.out.println("You are eligible to donate.");
            }
            else System.out.println("Your weight is below 50, sorry you are not eligible.");
        }
        else System.out.println("You are below 18, You are not eligible. ");
    }
}