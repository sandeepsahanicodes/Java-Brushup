/*27- About Super keyword*/
/*
 ~ program on accessing methods of parent class
*/

class Parent
{
    void show()
    {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent
{
    void show()
    {
        System.out.println("Child class show");
    }

    void display()
    {
        System.out.println("Child class display method");
        show(); // Child class show
        super.show(); // Parent class show method 
    }
}
// Driver class
class SuperKeywordTwo 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.display();
    }
}
