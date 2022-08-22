class RectangleDriver 
{
    private int length;
    private int breadth;

    void init(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void display()
    {
        System.out.println("Length= "+length+"Breadth= "+breadth);
    }
    void calculateArea()
    {
        System.out.println("Area= "+(length*breadth)+"Sq Unit");
    }
    void calculatePerimeter()
    {
        System.out.println("Perimeter= "+2*(length+breadth)+"CM");
    }


}
