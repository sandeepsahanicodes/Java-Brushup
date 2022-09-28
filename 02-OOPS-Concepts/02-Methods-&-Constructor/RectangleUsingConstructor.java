/* 08- Rectangle program using constructor */

class Rectangle
{
    int length,breadth;
    Rectangle()
    {
        // Default constructor
    }
    Rectangle(int l,int b) // To initialize length and breadth value
    {
        length=l;
        breadth=b;
    }
    int area()
    {
       return length*breadth; // Calculates area
    }
    int perimeter()
    {
        return 2*(length+breadth); // Calculates perimeter
    }
    void display() // To display length of rectangle
    {
        System.out.println("Length of rectangle is "+length+" units");
        System.out.println("Breadth of rectangle is "+breadth+" units");
    }
}
// Driver class
class RectangleUsingConstructor 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(10, 20); // Rectangle class object
        System.out.println("Area of rectangle is "+r.area()+" Sq units");
        System.out.println("Perimeter of rectangle is "+r.perimeter()+" units");
        r.display();
    }
}
