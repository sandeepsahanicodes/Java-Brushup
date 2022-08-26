/* 07- All about constructors */

/* 
   ~ Constructor is a special type of method which gets called when object of that class is created.
   ~ Constructor is same as class name with no return typr written. 

*/
class Constructor 
{   
    
    Constructor()
    {
       System.out.println("Default constructor"); // Constructor block
    }
}
// Driver class
class ConstructorDriver
{
    public static void main(String[] args) 
    {
        Constructor c = new Constructor();
    }
}
