package Week4;

class Student
{
    public void methodStudent()
    {
        System.out.println("Week4.Student method is called.");
    }
}
class Science extends Student
{
    public void methodScience()
    {
        System.out.println("Week4.Science method is called.");
    }
}
class Arts extends Student
{
    public void methodArts()
    {
        System.out.println("Week4.Arts method is called.");
    }
}
class Commerce extends Student
{
    public void methodCommerce()
    {
        System.out.println("Week4.Commerce method is called.");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        Science sci =new Science();
        Arts art = new Arts();
        Commerce com = new Commerce();
        sci.methodStudent();
        art.methodStudent();
        com.methodStudent();
        sci.methodScience();
        art.methodArts();
        com.methodCommerce();
    }
}
