/*32- Overriding rules*/
/*
 ~ Overridden method can't be static and vice versa.
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
   @Override
   void m1()
   {
     System.out.println("Child class m1 method");
   }
}
// Driver class
class OverridingRules2
{
    public static void main(String[] args)
    {
        Parent parentHoldsChild=new Child();
        parentHoldsChild.m1(); // Error: overridden method is static 
    }
}
