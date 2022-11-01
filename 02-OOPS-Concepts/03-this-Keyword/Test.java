/* 11- Illustration of this, this(),this(Args 1,Arg 2,...,Arg n) */

/*
 ~ this holds current object reference
 ~ this() uses to call current class no argument(Default) constructor
 ~ this(Args 1,Arg 2,...,Arg n) used to call argumented constructor of current class
 ~ this() and this(Args 1,Arg 2,...,Arg n) always should be written in first line of constructor block else
   run time error will occur
 ~ Calling constructor via this() and this(Args 1,Arg 2,...,Arg n) is called as constructor chaining
 */

class Test
{

    Test()
    {
       this(10); // Calling test(int a) via this(int a)
       System.out.println("No argument constructor");
    }
    
    Test(int a)
    {
        this(10,20); // Calling test(int a,int b) via this(int a,int b)
        System.out.println("One argument constructor");
    }
    Test(int a,int b)
    {
        System.out.println("Two argument constructor");
    }
    
    // Driver method
    public static void main(String[] args) 
    {
        Test t = new Test(); // Instance of Test class
    }
}
