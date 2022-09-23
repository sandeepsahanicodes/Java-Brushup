/*23- Inheritance constructor*/

class A
{
    A()
    {
        System.out.println("A class default constructor");
    }
}

class B extends A // Child class
{
   B() 
   {
    // super() -> compiler generates this line which calls parent class constructor
    System.out.println("B class default constructor");
   }
}
// Driver class
public class ConstructorInheritance 
{
    public static void main(String[] args) 
    {
        B b=new B();
    }
}
