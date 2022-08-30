package Week4;

import java.util.Scanner;

abstract class Banking
{
    int money = 25000;
    abstract void deposit();
    abstract void transfer();
}
class SBI extends Banking
{
    void deposit()
    {
        System.out.print("Enter PIN : ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == 1234)
        {
            System.out.print("Enter amount to be deposit: ");
            int depositmoney = sc.nextInt();
            money = money + depositmoney;
            System.out.println("Net amount is " +money);

        }
        else System.out.println("Invalid PIN");
    }
    void transfer()
    {
        System.out.print("Enter PIN : ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == 1234)
        {
            System.out.print("Enter amount to be transfer: ");
            int transfermoney = sc.nextInt();
            money = money - transfermoney;
            if (money < transfermoney)
            {
                System.out.println("Insufficient Balance");
            }else System.out.println("Net amount is " + money);
        }
        else System.out.println("Invalid PIN");
    }
}
public class AbstractionExample
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        Banking bank = new SBI();
        System.out.println("1: Deposit");
        System.out.println("2: Transfer");
        System.out.print("Enter your choice : ");
        int choice = s1.nextInt();
        switch (choice) {
            case 1 -> bank.deposit();
            case 2 -> bank.transfer();
            default -> System.out.println("Invalid Choice");
        }

    }


}