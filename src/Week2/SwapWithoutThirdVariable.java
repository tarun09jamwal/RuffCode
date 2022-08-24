package Week2;

import java.util.Scanner;

public class SwapWithoutThirdVariable
{
    public static void main(String[] args)
    {
        int a =13, b=23;
        System.out.println("Before swapping values are : " + a + " "+ b);
        a = a + b;
        b= a -b;
        a= a- b;
        System.out.println("After swapping values are :  "+ a +" "+ b );
    }
}
