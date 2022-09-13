/* 13- About non static concept */
class NonStatic 
{
    int x; // Non static instance variable
    NonStatic() // Default constructor
    {
        System.out.println("Default constructor");
    }
    
    // Non static block
    {
       System.out.println("Non static block 1");
    }
    // Non static method
    void m1()
    {
        System.out.println("Non static method 1");
    }
    // Non static block
    {
        System.out.println("Non static block 2");
    }
    
    // Driver method
    public static void main(String[] args) 
    {
        NonStatic ns = new NonStatic(); // Instance of class NonStatic
        ns.m1(); // Method call
    }
}
