package Week4;

import java.util.Scanner;

class Bank
 {
     private int money = 10000;
     private int pin =1234;

     void Transfer()
     {
         System.out.println("Enter Pin");
         Scanner sc = new Scanner(System.in);
         pin = sc.nextInt();
         if (pin == 1234)
         {
             System.out.println("Enter amount to transfer : ");
             int transfer = sc.nextInt();
             money = money - transfer;
             if (money < transfer)
             {
                 System.out.println("Insufficient balance.");
             }else
                 System.out.print("Net balance is : "+money);
         }
         else System.out.println("Invalid PIN");
     }
     void Deposit()
     {
         System.out.println("Enter Pin");
         Scanner sc = new Scanner(System.in);
         pin = sc.nextInt();
         if (pin == 1234)
         {
             System.out.println("Enter amount to be deposit : ");
             int depositmoney = sc.nextInt();
             money = money + depositmoney;
             System.out.print("Total balance is "+money);
         }
         else System.out.println("Invalid PIN");
     }
 }

 public class EncapsulationExample
 {
     public static void main(String[] args)
     {
         Bank sbi = new Bank();
         System.out.println("1. Transfer");
         System.out.println("2. Deposit");
         Scanner sc1 = new Scanner(System.in);
         System.out.print("Enter the value: ");
         int value = sc1.nextInt();
         switch (value) {
             case 1 -> sbi.Transfer();
             case 2 -> sbi.Deposit();
         }
     }
 }