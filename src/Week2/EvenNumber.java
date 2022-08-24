package Week2;

public class EvenNumber
{
    public static void main(String[] args)
    {
        int num = 50;
        for (int i= 1; i<=num; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even numbers are : "+i);
            }
        }
    }
}
