package Week4;

class Default
{
    String name;
    Default()
    {
        name = "Tarun";
    }
}
public class DefaultConstructor
{
    public static void main(String[]args) {
        Default d = new Default();
        System.out.println(d.name);
    }
}