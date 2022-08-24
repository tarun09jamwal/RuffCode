package Week2;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int i, num,  count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = sc.nextInt();
        for (i= 1; i<=num; i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println("Entered number is Prime");
        }
        else System.out.println("Entered number is not prime.");
    }
}
