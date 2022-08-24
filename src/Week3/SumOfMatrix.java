package Week3;

import java.util.Scanner;
public class SumOfMatrix
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st matrix data.");
        for (int i= 0; i< 2; i++)
        {
            for (int j= 0; j< 2; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix data.");
        for (int i= 0; i<2; i++)
        {
            for (int j= 0; j< 2; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st Matrix: ");
        for (int i= 0; i< 2; i++)
        {
            for (int j= 0; j< 2; j++)
            {

                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("2nd Matrix: ");
        for (int i= 0; i< 2; i++)
        {
            for (int j= 0; j< 2; j++)
            {

                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Sum of matrix: ");
        for (int i= 0; i<2; i++)
        {
            for (int j= 0; j< 2; j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
