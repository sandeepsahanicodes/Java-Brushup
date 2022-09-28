/* 03-Taking user input using Scanner class*/

/* 
   ~ Scanner is pre defined class for taking input from console.
   ~ In order to use Scanner class we have to import it.
   ~ Syntax
    Scanner objectName = new Scanner(System.in); // Object of Scanner class
    objectName.nextLine(); // To take String input
    objectName.nextInt(); // To take integer input
   ~ After using Scanner object its a good practice to close it by writing objectName.close();
*/

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
