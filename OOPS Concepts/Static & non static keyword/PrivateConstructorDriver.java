/*17- Private constructor concept*/

class PrivateConstructor
{
   private PrivateConstructor() // Can't create object of a class with private constructor outside the same class
   {
     System.out.println("Private constructor");
   }

   static void createObject()
   {
      PrivateConstructor pc=new PrivateConstructor(); // Create object within same class
   }
}
// Driver class
class PrivateConstructorDriver
{
    public static void main(String[] args)
    {
      // PrivateConstructor pc=new PrivateConstructor();  // Throws error 'PrivateConstructor() has private access in PrivateConstructor'

      PrivateConstructor.createObject(); // Creates object
        
    }
}