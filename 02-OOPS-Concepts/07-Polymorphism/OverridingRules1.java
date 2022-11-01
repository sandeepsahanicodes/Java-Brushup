/*31- Overriding rules*/
/*
 ~ We can't overriding varible.We can only override methods.
 ~ When instance variable in child class and parent class is
   same then the class which reference is created that class 
   variable will get accessed.
 */
class Parent
{
   int x=10; // Parent instance variable
   void m1()
   {
     System.out.println("Parent class m1 method");
   }
}

class Child extends Parent
{
   int x=20; // Child instance variable
   @Override
   void m1()
   {
     System.out.println("Child class m1 method");
   }
}
// Driver class
class OverridingRules1 
{
    public static void main(String[] args)
    {
        Child childHoldsChild=new Child();
        System.out.println("Child x="+childHoldsChild.x); // Childs instance variable gets accessed as reference is of child.
        Parent parentHoldsChild=new Child();
        System.out.println("Parent x="+parentHoldsChild.x); // Reference's instance variable will gets accessed(i.e Parents x).
    }
}
