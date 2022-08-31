package Week5;
class Employee
{
    void Show(String a)
    {
        System.out.println("Show A");
    }
    void Show(int a)
    {
        System.out.println("Show B");
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
            Employee e =new Employee();
            e.Show(10);
            e.Show("Tarun");
    }
}
