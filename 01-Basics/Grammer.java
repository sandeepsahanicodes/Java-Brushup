/* 02-Basic grammer of java*/

/* 
   ~ In java , + is overloaded operator used to concatenate strings.
   ~ Number + Number = Number
     Number + String = String
     String + Number = String
   ~ This can be used for formating output like to concate a string with number etc.
*/

class Grammer 
{
    public static void main(String[] args) 
    {
        int num1=10;
        int num2=20;
        int sum,multiply;
        sum=num1+num2;
        multiply=num1*num2;
        System.out.println("First number= "+num1);
        System.out.println("Second number= "+num2);
        System.out.println("Sum= "+sum);
        System.out.println("Multiply= "+multiply);

    }
}
