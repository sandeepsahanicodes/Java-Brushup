/* 04-Learned about classes and object*/
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
        System.out.println("Length= "+length+"Breadth= "+breadth);
    }
    public void calculateArea()
    {
        System.out.println("Area= "+(length*breadth)+"Sq Unit");
    }
    public void calculatePerimeter()
    {
        System.out.println("Perimeter= "+2*(length+breadth)+"CM");
    }

}

// Driver class
class RectangleDriver
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle(); // Rectangle class object
        r.init(10, 20);
        r.display();
        r.calculateArea();
        r.calculatePerimeter();
        r.calculateArea();
    }
}