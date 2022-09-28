/*20- Inheritance basics*/

/*
  ~ Inheritance is the process of creating new class from an existing class.
  ~ Classes may inherit or acquire the properties and methods of other classes.
  ~ This hepls in code reusability.
  ~ Basic Terminology
    ~ Parent class/Super class -> Class from new class is created
    ~ Child class/Base class/Derived class -> Class which aquires other class properties
  ~ Extends keyword is used to establish relationship between parent and child class
  ~ Inheritance is also called as 'is a' relationship
  ~ Syntax 
    class ParentClass
    {
        Property 1;
        Behaviour 1;
    } 

    class ChildClass extends ParentClass
    {
       Property 2;
       Behaviour 2; 
       // Parent class properties and behaviour is now available in child class
    }
*/

class Parent
{
    int x=10;
    void m1()
    {
        System.out.println("m1 method of parent class");
    }
}

class Child extends Parent 
{
    // child class can access parent methods and variables
    int y=20;
    void m2()
    {
        System.out.println("m2 method of child class");
    }
}
// Driver class
class Driver 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.m1(); // Parent class method accessed from child instance
        c.m2(); 
        System.out.println("x value is "+c.x+" from parent class");
        System.out.println("y value is "+c.y+" from child class");
    }   
}
