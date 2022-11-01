/* 09- Complex number problem using constructor */
class Complex
{
    int real,imaginary;
    Complex() // Its a good practice to include a default constructor if using argumented constructor
    {
        // Default constructor
    }

    Complex(int rn,int in) // Argumented constructor for initialization of complex number
    {
        real=rn;
        imaginary=in;
    }

    void display() // To display complex number
    {
       System.out.println("Complex number is "+real+"+"+imaginary+"i");
    }
}
// Driver class
class ComplexNumberUsingConstructor 
{
    public static void main(String[] args) 
    {
        Complex c1 = new Complex(2, 3); // Complex class object
        c1.display(); // Display complex number

        Complex c2 = new Complex(4, 5);
        c2.display();
    }
}
