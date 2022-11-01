/* 12- Program for adding complex number*/

class Complex
{
    private int real,imaginary;

    Complex()
    {
        real=0;
        imaginary=0;
    }

    Complex(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    void display()
    {
        System.out.println("Complex number is "+real+"+"+imaginary+"i");
    }

    void add(Complex c2)
    {
        Complex c3=new Complex();
        c3.real = this.real+c2.real;
        c3.imaginary = this.imaginary+c2.imaginary;
        c3.display();
    }

}

class AddComplexNumber
{
    public static void main(String[] args) 
    {
        Complex c1 = new Complex(4,5);
        Complex c2 = new Complex(6, 7);
        c1.display();
        c2.display();
        c1.add(c2);
    }
}