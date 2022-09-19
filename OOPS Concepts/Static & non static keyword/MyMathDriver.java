/*18- Utility class concept*/
/*
  ~ Class which contains only static members called as Utility class
  ~ Non need of object creation of an utility class, methods can be 
    accessed using class name only
*/
class MyMath
{
    static int add(int a,int b) 
    {
       return a+b;
    }

    static int sub(int a,int b)
    {
       return a-b;
    }

    static int product(int a,int b)
    {
       return a*b;
    }

    static int division(int a,int b)
    {
       return a/b;
    }
}
// Driver class
class MyMathDriver 
{
    public static void main(String[] args)
    {
        System.out.println("Addition of 10 and 20 is "+MyMath.add(10, 20)); // Used class name to call methods
        System.out.println("Subtraction of 10 and 20 is "+MyMath.sub(10, 20));
        System.out.println("Product of 10 and 20 is "+MyMath.product(10, 20));
        System.out.println("Division of 10 and 20 is "+MyMath.division(10, 20));

    }
}
