/*25- Inheritance constructor*/
/*
   ~ Inheritance with parameterised constructor
*/
class A
{
    // No default constructor will be generated.so super()(Implicitly generated by compiler) will throw error
    A(int a)
    {
        System.out.println("A class parameterised constructor");
    }
}

class B extends A // Child class
{

   B(int a) 
   {  
      // super(); // No default constructor in immediate parent class is available.We have to explicitly define super(int) in first line of constructor block.
      super(a); // This is available in immediate parent class consructor so error will disappear.
      System.out.println("B class default constructor");
   }
}
// Driver class
public class ConstructorInheritanceThree
{
    public static void main(String[] args) 
    {
        B b=new B(10);
    }
}
