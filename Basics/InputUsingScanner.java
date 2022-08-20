/* 03-Taking user input using Scanner class*/
import java.util.Scanner; // Importing Scanner class
class InputUsingScanner
{
    public static void main(String[] args) 
    {
        int num1=0,num2=0;
        int add,multiply;

        Scanner sc= new Scanner(System.in); // Instance of Scanner class
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();

        add=num1+num2;
        multiply=num1*num2; 

        System.out.println("First number="+num1);
        System.out.println("Second number="+num2);
        System.out.println("Sum="+add);
        System.out.println("Multiply="+multiply);
        sc.close(); // Closing Scanner object

    }
}
