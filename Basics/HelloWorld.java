/* 01-Basic java program structure and compilation */

/* 
   ~ javac programName.java (Compilation)
   ~ java programName (Execution)

*/

class HelloWorld 
{
     String name;
     String age;
     static String language; // Static variable
     boolean isProgrammer; // Instance variable
    public static void main(String[] args) // Execution starts from here ! 
    {
        int localVariable=10; // Local variable
        System.out.println("Hello World"); // Prints "Hello World on console"
        System.out.println("Local variable value is "+localVariable);
    }
    
}
