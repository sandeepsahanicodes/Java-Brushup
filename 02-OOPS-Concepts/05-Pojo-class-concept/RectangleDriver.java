/*19- Pojo class concept*/
/*
  ~ Pojo stands for plan object java object
  ~ This is class design technique where variables are private and to set or get
    its value we use methods.
  ~ Methods which sets variables value is called setter or mutator method.
  ~ Methods from which variables value is retrieved called getter or accessor method.
  ~ syntax of setter method
    public returnType setVariableName(returnType argName)
    {
        this.argName=argName;
    }
  ~ syntax of getter method
    public returnType setVariableName()
    {
        return variableName;
    }

 */
class Rectangle
{
   private int length;
   private int breadth;

   Rectangle() // Default constructor
   {
    
   }

   Rectangle(int length,int breadth) // Parameterised constructor
   {
      this.length=length;
      this.breadth=breadth; 
   }

   public void setLength(int length) // Setter for length
   {
      this.length=length; 
   }

   public void setBreadth(int breadth) // Setter fot breadth
   {
      this.breadth=breadth; 
   }

   public void update(int length,int breadth) // To set length and breadth values at same time
   {
      this.length=length;
      this.breadth=breadth;
   }

   public int getLength() // Getter for length
   {
      return length; 
   }

   public int getBreadth() // Getter for breadth
   {
      return breadth; 
   }

   public int area() // Calculates area
   {
    return length*breadth;
   }

   public int perimeter() // Calculates perimeter
   {
    return 2*(length+breadth);
   }

   public void display() // Display rectangles all properties
   {
     System.out.println("Length: "+length);
     System.out.println("Breadth: "+breadth);
     System.out.println("Area: "+area());
     System.out.println("Perimeter: "+perimeter());
   }
}
// Driver class
class RectangleDriver 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(10, 20);
        r.setLength(12); // Set length
        r.setBreadth(13); // Set breadth
        System.out.println("Length = "+r.getLength()); // Get lenght
        System.out.println("Breadth = "+r.getBreadth()); // Get breath
        System.out.println("Area = "+r.area()); // Get area
        System.out.println("Perimeter = "+r.perimeter()); // Get perimeter
        r.update(14, 15); // Update length and breadth values
        r.display(); // Display all parameters
    }
}
