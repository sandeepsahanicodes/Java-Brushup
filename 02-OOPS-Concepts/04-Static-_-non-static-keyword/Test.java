/* 15- Second Program for illustrate difference between static and non static memebers*/
class Test 
{
    int x; // Non static instance variable.This will create everytime when new object is created
    static int y; // Static instance variable.This will create only once.
    Test() // Default constructor
    {
        ++x; // increment x by one
        ++y; // increment y by one
    }
    // Driver method
    public static void main(String[] args) 
    {
        Test t1=new Test(); // Object of class Test
        Test t2=new Test();
        Test t3=new Test();
        System.out.println(t1.x+" "+t1.y); // 't1.y' will give a warning saying 'The static field Test.y should be accessed in a static way' 
        System.out.println(t2.x+" "+t2.y);
        System.out.println(t3.x+" "+t3.y);
    }
}
