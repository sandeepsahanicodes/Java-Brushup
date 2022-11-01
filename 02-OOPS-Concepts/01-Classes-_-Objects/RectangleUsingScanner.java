/* 05- Taking user input in rectangle program */
import java.util.Scanner;
class Rectangle
{
    private int length;
    private int breadth;

    public void init(int length,int breadth) // Method to initialize length and breadth
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void display()
    {
        System.out.println("Length = "+length+" "+"Breadth = "+breadth);
    }
    public void calculateArea()
    {
        System.out.println("Area = "+(length*breadth)+"Sq Unit");
    }
    public void calculatePerimeter()
    {
        System.out.println("Perimeter = "+2*(length+breadth)+"CM");
    }

}
class RectangleUsingScanner 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int length,breadth;
        Rectangle r = new Rectangle();
        System.out.println("Enter length value");
        length = sc.nextInt();
        System.out.println("Enter breadth value");
        breadth = sc.nextInt();

        r.init(length, breadth);
        r.display();
        r.calculateArea();
        r.calculatePerimeter();
        r.calculateArea();
        r.display();
        sc.close();
    }

}
