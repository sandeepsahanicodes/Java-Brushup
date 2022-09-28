/* 16- Program to count number of objects.*/
class ObjectA
{
    static int count; // Static variable for storing count value
    ObjectA()
    {
       count++;
    }
}
// Driver class
class CountObjectDriver 
{
    public static void main(String[] args) 
    {
        ObjectA ob1=new ObjectA();
        ObjectA ob2=new ObjectA();
        ObjectA ob3=new ObjectA();
        ObjectA ob4=new ObjectA();
        ObjectA ob5=new ObjectA();

        System.out.println("Total object of class ObjectA is "+ObjectA.count); // Printing total object

    }
}
