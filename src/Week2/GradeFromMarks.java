package Week2;

import java.util.Scanner;

public class GradeFromMarks
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total marks : ");
        int tm  = sc.nextInt();
        if (tm>=90 && tm <= 100)
        {
            System.out.println("Grade A+");
        }
        else if (tm>= 80 && tm<90 )
        {
            System.out.println("Grade A");
        }
        else if (tm>=70 && tm<80)
        {
            System.out.println("Grade B");
        }
        else if (tm>=60 && tm <70)
        {
            System.out.println("Grade C");
        }
        else if (tm>=50 && tm<60)
        {
            System.out.println("Grade D");
        }
        else if (tm<50)
        {
            System.out.println("Fail");
        }
        else System.out.println("Invalid Input");
    }
}