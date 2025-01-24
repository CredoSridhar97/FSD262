// L2 - OOPS Java - What is OOP? - What are Classes and Objects? - Create a Class - Create an Object 
// Multiple Objects - Using Multiple Classes - Class Attributes - Accessing Attributes 
// Modify Attributes - final keyword - Multiple Attributes - Class Methods - Static vs Public Methods 
public class Day1 { 
    String Name = "Sridhar";
    int Age = 27;
    String Role = "L&D";
    double Salary = 40000;

    public static void main(String args[]) {
        Day1 answer = new Day1();
        System.out.println(answer.Name);
        System.out.println(answer.Age);
        System.out.println(answer.Role);
        System.out.println(answer.Salary);

        // Multiple Objects & Modify Attributes
        Day1 answer1 = new Day1();
        System.out.println(answer1.Name);
        answer1.Name = "Sasi";
        System.out.println(answer1.Name);
    }
}
