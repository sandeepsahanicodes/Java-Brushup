/*22- Inheritance with private class members*/


// Parent class
class Super
{
   private int x=10;
   private void m1() // Private member are not inherited in child class
   {
    System.out.println("Private parent class method m1");
   }
}
// Child class
class Base extends Super
{
    int y=10;
    public void m2()
    {
     System.out.println("Public child class method m2");
    }
}
// Driver class
class PrivateDriver 
{
     public static void main(String[] args) 
     {
        Base b=new Base();
        System.out.println("y value is "+b.y);
        b.m2();
        // System.out.println("y value is "+b.x); // Error; we cant inherit private members of super class
        // b.m1(); // Error; we cant inherit private members of super class

     }
}
