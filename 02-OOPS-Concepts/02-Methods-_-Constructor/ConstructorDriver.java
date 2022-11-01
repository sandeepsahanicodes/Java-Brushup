/* 07- All about constructors */

/* 
   ~ Constructor is a special type of method which gets called when object of that class is created.
   ~ Constructor is same as class name with no return type written.
   ~ Syntax
   className()
   {
    // Code
   }
   ~ Compiler creates a default constructor in every class when there is no constructor defined.
   ~ Types: Zero argument,Argumented constructor
*/
class Constructor 
{   
    // Zero argument constructor
    Constructor()
    {
       System.out.println("Zero argument constructor"); // Constructor block
    }
    
    // Argumented constructor
    Constructor(int a)
    {
        System.out.println("Argumented constructor");
    }

}
// Driver class
class ConstructorDriver
{
    public static void main(String[] args) 
    {
        Constructor c1 = new Constructor(); // Zero args constructors block will execute
        Constructor c2 = new Constructor(10); // Argumented constructors block will execute

    }
}
