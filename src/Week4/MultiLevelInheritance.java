package Week4;

class Car
{
    void engine()
    {
        System.out.println("Engine started.");
    }
    void breaks()
    {
        System.out.println("Abs breaking system.");
    }
    void gears()
    {
        System.out.println("Has 6 gears.");
    }
}
class Cycle extends Car
{
    void wheels()
    {
        System.out.println("It has 2 wheels");
    }
}
class Bike extends Cycle
{
    void seat()
    {
        System.out.println("It has two seats");
    }
}
public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        Bike b = new Bike();
        Cycle c = new Cycle();

        b.seat();
        b.wheels();
        b.engine();
        b.breaks();
        b.gears();
        c.breaks();

    }
}