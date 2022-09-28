/*21- Illustration of inheritance using student problem*/

// Person class file
class Person 
{
    private String name;
    private int age;

    public void setName(String name)
    {
      this.name=name;
    }

    public String getName()
    {
       return name;
    }

    public void setAge(int age)
    {
      this.age=age;
    }

    public int getAge()
    {
       return age;
    }
}

// Student class file
class Student extends Person // Student class has access of all methods of Person class
{
    private float marks;

    public void setMark(float marks)
    {
        this.marks=marks;
    }

    public float getMark()
    {
        return marks;
    }
}


// Driver class file
public class StudentDriver
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        s.setName("Sandeep");
        s.setAge(20);
        s.setMark(90); // Setting student details from setters
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Mark: "+s.getMark()); // Getting student details from getters
    }
}
