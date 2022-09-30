/*35- Overriding rules*/
/*
 ~ Overridden methods should not be final.
 */
class Parent
{
   final void m1() // Can't override final method;Error: overridden method is final
   {
     System.out.println("Parent class m1 method");
   }
}

class Child extends Parent
{
   
   public void m1()
   {
     System.out.println("Child class m1 method");
   }
}
// Driver class
class OverridingRules4
{
    public static void main(String[] args)
    {
        Child childHoldsChild=new Child(); 
        childHoldsChild.m1(); // Childs method will get called.
        Parent parentHoldsChild=new Child();
        parentHoldsChild.m1(); // Parents method will get called.
    }
}
