/*24- Inheritance constructor*/
/*
   ~ Inheritance with parameterised constructor
*/
class A
{
    A()
    {
        System.out.println("A class default constructor");
    }

    A(int a)
    {
        System.out.println("A class parameterised constructor");
    }
}

class B extends A // Child class
{
   B(int a) 
   {
    // super() -> compiler generates this line which calls parent class constructor
    System.out.println("B class default constructor");
   }
}
// Driver class
public class ConstructorInheritanceTwo
{
    public static void main(String[] args) 
    {
        B b=new B(10);
    }
}
