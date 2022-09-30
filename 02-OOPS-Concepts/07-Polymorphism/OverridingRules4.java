/*34- Overriding rules*/
/*
 ~ public > protected > default > private (Access modifier list)
 ~ If overriding method has greater access modifier attached than overriden method than its invalid.
 ~ Overriding should have lesser access modifier
 */
class Parent
{
   protected void m1()
   {
     System.out.println("Parent class m1 method");
   }
}

class Child extends Parent
{
   
   public void m1() // public > protected
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
