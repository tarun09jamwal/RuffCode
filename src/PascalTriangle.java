public class PascalTriangle
{
    public static void main(String[] args)
    {
        int a,b,c;
        for (a =0; a<=4; a++)
        {
            for (b =a; b<=3;b++)
            {
                System.out.print(" ");
            }
            int e= 1;
            for (c=0; c<= a; c++)
            {
                System.out.print(e + " ");
                e= e *(a-c)/(c+1);
            }
            System.out.println();
        }
    }
}