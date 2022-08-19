public class PalindromeProgram
{
    public static void main(String[]args)
    {
        int num = 121,rem, rev=0;
        int temp= num;
        while (num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome.");
    }
}