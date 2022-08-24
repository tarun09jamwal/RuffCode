class Dog
{
    void eat()
    {
        System.out.println("Eating");
    }
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void bark()
    {
        System.out.println("Barking");
    }
}
class Birds extends Dog
{
    void fly()
    {
        System.out.println("Flying");
    }
}
public class SingleInheritance
{
    public static void main(String[]args)
    {
        Dog d = new Dog();
        Birds b = new Birds();
        b.eat();
        b.sleep();
        b.fly();
        d.bark();
    }
}