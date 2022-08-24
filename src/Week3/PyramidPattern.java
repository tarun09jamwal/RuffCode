package Week3;

public class PyramidPattern
{
    public static void main(String[] args)
    {
        for (int i= 1; i<= 6; i++)
        {
            for (int j=6; j>=i; j--)
            {
                System.out.print("   ");
            }
            for (int k= 1; k<= i ;k++)
            {
                System.out.printf(" * ");
            }
            for ( int l= 1; l<=i-1; l++)
            {
                System.out.printf(" * ");
            }
            System.out.println();
        }
    }
}
