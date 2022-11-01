/*33- Overriding rules*/
/*
 ~ If both overriding and overriden methods are static then its called method hiding.This
   is not overriding.
 ~ Method call depend on reference variable in this case.
 */
class Parent
{
   static void m1()
   {
     System.out.println("Parent class m1 method");
   }
}

class Child extends Parent
{
   
   static void m1()
   {
     System.out.println("Child class m1 method");
   }
}
// Driver class
class OverridingRules3
{
    public static void main(String[] args)
    {
        Child childHoldsChild=new Child(); 
        childHoldsChild.m1(); // Childs method will get called.
        Parent parentHoldsChild=new Child();
        parentHoldsChild.m1(); // Parents method will get called.
    }
}
