/*28- About Super keyword*/
/*
 ~ Real life example illustration of super().
*/

class Person
{
    private String name;
    private int age;

    Person()
    {
        // Default constructor
    }

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person
{
    private int mark;
    
    Student()
    {
        // Default constructor
    }

    Student(String name,int age,int mark)
    {
        super(name, age); // Passing name and age from Student class to Person class constructor
        this.mark=mark;
    }

    public void look()
    {
        show();
        System.out.println("Mark: "+mark);
    }
}
// Driver class
class SuperKeywordThree 
{
    public static void main(String[] args) 
    {
        Student s = new Student("Sandeep", 20, 90);
        s.look(); // Show student details
    }
}
