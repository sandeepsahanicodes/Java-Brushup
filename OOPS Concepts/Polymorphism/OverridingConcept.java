/*30- About Overriding*/
/*
  ~ Overloading is the process of redefining the method defination of parent class
    in child class if child class is not satisfied with its defination.
  ~ Overriding is also known as dynamic polymorphism(Run time polymorphism).
  ~ Overriding need atleast two classes.
  ~ In order to override a method it has to be defined same as defined in parent class or else 
    overriding will not be carried out. 
*/
class Parent 
{
   void m1()
   {
      System.out.println("Parent class m1 method");
   }
}

class Child extends Parent
{
   @Override // Java annotation 
   void m1()
   {
     System.out.println("Child class redefining m1 method");
   }
}
// Driver class
public class OverridingConcept 
{
    public static void main(String[] args) 
    {
        Parent p = new Parent(); // Access parent class m1 method
        p.m1();
        Child c = new Child();
        c.m1(); // Ovverriden m1 method from parent class
        Parent parentHoldsChild = new Child(); // Upcasting
        parentHoldsChild.m1(); // Access all child methods
        // Child childHoldsParent = new Parent(); // Error: Downcasting is invalid

    }
}
