/* 06- All about methods */
class Method
{
    void m1() // Non static method
    {
        System.out.println("Non static method m1()");
        // Direct call
        m2();// Non static method can call both static as well as non static method.
    }

    static void m2() // Static method
    {
        // Static method can call only staic method.
        // To call non static method static method need object.
        System.out.println("Non static method m2()");
    }
}

// Driver class
class MethodDriver
{
   public static void main(String[] args) 
   {
     
      Method m = new Method(); // Method class object
      // call using object
      m.m1(); // Non static method uses object for calling
      Method.m2(); // Static method can be called using class name
   }
}
