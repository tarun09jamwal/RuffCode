package Week5;
class Car
{
    void Start(String s)
    {
        System.out.println("Car Started");
    }
    void Stop(int a)
    {
        System.out.println("Car Stopted");
    }
}
class Bike extends Car
{
    void Start(String s)
    {
        System.out.println("Bike Started");
    }
    void Stop(int a)
    {
        System.out.println("Bike Stoped");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        Car b = new Bike();
        b.Start("RE");
        b.Stop(1250);

    }
}
