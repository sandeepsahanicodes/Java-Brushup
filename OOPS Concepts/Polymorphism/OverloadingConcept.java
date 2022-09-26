/*29- About Overloading*/
/*
  ~ Overloading is the process of defining methods with same name and
    different argument(aka Method signature).
  ~ Overloading is also known as static polymorphism.
  ~ Overloading is done within one class.
  ~ Two method with same name and argument is not valid, it must be different to avoid ambiguity.
*/
class OverloadingConcept 
{
    void m1()
    {
        System.out.println("Zero args m1 method");
    }

    void m1(int x)
    {
        System.out.println("One integer args m1 method");
    }

    void m1(int x,int y) 
    {
        System.out.println("Two integer args m1 method");
    }

    void m1(float x,int y) 
    {
        System.out.println("Float integer args m1 method");
    }

    void m1(int x,float y) // Method m1 is overloaded method
    {
        System.out.println("Integer float args m1 method");
    }

    // Driver method
    public static void main(String[] args) 
    {
        OverloadingConcept oc = new OverloadingConcept();
        oc.m1();
        oc.m1(10);
        oc.m1(10,20);
        oc.m1(10.6f,20);
        oc.m1(10,20.6f); // Method calls 
    }
}
