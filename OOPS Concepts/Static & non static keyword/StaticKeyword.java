/* 12- About static keyword */
/*
~ Static keyword is used to define comman class members.
~ Static members are asscessed using class name.

 */
class Static
{
    static int x; // Static variable
    Static()
    {               
        System.err.println("Default caonstructor");
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
