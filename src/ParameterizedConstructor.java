public class ParameterizedConstructor
{
    int age;
    String name;
    public ParameterizedConstructor(int myAge,String myName)
    {
        age = myAge;
        name = myName;
    }

    public static void main(String[] args)
    {
        ParameterizedConstructor p = new ParameterizedConstructor(26,"Tarun");
        System.out.println("My name is "+ p.name+" and my age is "+ p.age);
    }

}