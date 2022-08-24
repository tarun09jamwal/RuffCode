package Week2;

public class SwapTwoNumber
{
    public static void main(String[] args)
    {
        int n1= 10, n2 =20, temp;
        System.out.println("Before swapping values are :"+ n1 + " " + n2);
        temp = n1;
        n1= n2;
        n2 = temp;
        System.out.println("After swapping values are : " + n1 + " "+  n2 );
    }
}
