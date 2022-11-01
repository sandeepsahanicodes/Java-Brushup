/* 12- About static keyword concept */

/*
~ The static variable can be used to refer to the common property of all objects (which is not unique for each object)
~ We can apply static keyword with variables, methods, blocks and nested classes
~ Static members are asscessed using class name.
~ Static variable creates only once.

~ Static control flow
  1.Identification of static members from top to bottom.All the static variables, methods, and blocks are identified during this step.

  2.Execution of static variable assignments and static blocks from top to bottom.

  3.Finally, the static main method is executed in the last step of the static control flow.
 
 */

class Static
{
    static int x; // Static variable
    Static()
    {               
        System.out.println("Default constructor");
    }
    static // Static block
    {
        System.out.println("Static block one");
    }

    static void m1() // Static method one
    {
        System.out.println("Static method");
    }
}
// Driver class
class StaticKeyword 
{
    public static void main(String[] args) 
    {
        Static.m1(); // Static method can be called using class name
    }
}
