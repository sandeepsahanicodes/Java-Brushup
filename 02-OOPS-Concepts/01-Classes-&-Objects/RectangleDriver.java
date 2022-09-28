/* 04-Learned about classes and object*/

/* 
   ~ Class is blueprint for an object.
   ~ Class doesn't occupies space in memory its the object which which occpies memory.
   ~ Syntax 
     class ClassName // class syntax
     {
        // properties(Variables)
        // Behaviours(Methods)
     }
     
     ClassName objectName = new ClassName(); // object creation
   ~ Its recommended to write class name in Pascel case.
*/

class Rectangle
{
    private int length;
    private int breadth;

    public void init(int l,int b) // Method to initialize length and breadth
    {
        length=l;
        breadth=b;
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
        r.display();
    }
}