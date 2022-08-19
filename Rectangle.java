public class Rectangle 
{
    private int length=10;
    private int breadth=10;

    void area()
    {
        System.out.println("Area= "+(length*breadth));
    }

    void peri()
    {
        System.out.println("Perimeter= "+(2*(length+breadth)));
    }
    void disp()
    {
        System.out.println("Length= "+length+"Bred= "+breadth);
    }
}
