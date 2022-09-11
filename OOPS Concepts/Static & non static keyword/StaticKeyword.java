/* 12- About static keyword */
/*
~ The static variable can be used to refer to the common property of all objects (which is not unique for each object)
~ We can apply static keyword with variables, methods, blocks and nested classes
~ Static members are asscessed using class name.
~ Flow for execution of static members
 

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
