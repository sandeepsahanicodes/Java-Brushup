import javax.swing.plaf.metal.MetalInternalFrameUI;

/*26- About Super keyword*/
/*
 ~ Super keyword is used to refer parent class object inside derived class if both classes
   method or variable name is same.
*/

class Parent
{
    int x=10;
    
}

class Child extends Parent
{
    int x=20; // Child instance variable
    void show()
    {
        int x=30; // Local variable
        System.out.println("Local variable="+x);
        System.out.println("Child instance variable="+this.x);
        System.out.println("Parent instance variable="+super.x); 
    }
}
// Driver class
class SuperKeywordOne 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.show();
    }
}
