package Week2;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.nextLine();
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}