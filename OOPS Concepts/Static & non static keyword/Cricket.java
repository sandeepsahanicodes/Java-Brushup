/* 14- Program for illustrate difference between static and non static memebers*/
class Cricket 
{
    String name; // Player name
    int individualScore;
    static int teamScore;

    Cricket(String name ,int individualScore) // Parameterised constructor for taking players input
    {
        this.name=name;
        this.individualScore=individualScore;
        teamScore = teamScore+individualScore;
    }

    void display() // Display players details
    {
        System.out.println(name+" "+individualScore);
    }

    // Driver method
    public static void main(String[] args) 
    {
        Cricket c1 = new Cricket("Virat", 100);
        Cricket c2 = new Cricket("Rohit", 80);
        c1.display();
        c2.display();
        System.out.println("Team score="+Cricket.teamScore); // Display team score(Common property)
    }

}
