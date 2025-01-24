
// float - nextFloat()
// int - nextInt()
// String - nextLine()
// long - nextLong()
// short - nextShort()

class Day7 {
    public static void main(String[] args) {
        // Scanner answer = new Scanner(System.in);
        // System.out.println("Enter the User Name - ");

        // String userName = answer.nextLine();
        // System.out.println("User Name - " + userName);

        // Scanner answer = new Scanner(System.in);
        // System.out.println("Enter the Age - ");
        // int Age = answer.nextInt();
        // if (Age >= 18) {
        // System.out.println("VE");
        // } else {
        // System.out.println("NVE");
        // }

        // Scanner answer = new Scanner(System.in);
        // System.out.println("Check the Number is Odd or Even");
        // int Number = answer.nextInt();
        // if (Number % 2 == 0) {
        // System.out.println("Even Number");
        // } else {
        // System.out.println("Odd Number");
        // }

        // Scanner answer=new Scanner(System.in);
        // System.out.println("Enter the Name, Age, Salary ");

        // String Name=answer.nextLine();
        // int Age=answer.nextInt();
        // double Salary=answer.nextDouble();

        // System.out.println("Name - "+Name);
        // System.out.println("Age - "+Age);
        // System.out.println("Salary - "+Salary);

        // Array - used to store multiple values in a single variable
        // square brackets

        // String Name[] = { "Sridhar", "Sasi", "Abi", "Raj Kumar", "Rani", "Ravi" };

        // for (String i : Name) {
        // System.out.println(i);
        // }

        // for (int i = 0; i < Name.length; i++) {
        // System.out.println(Name[i]);
        // }

        // for(type variable:arrayname)
        // {
        // ....
        // }

        // System.out.println(Name[0]);
        // //Change an Array Value
        // Name[0]="Sridhar Raj P";
        // System.out.println(Name[0]);
        // System.out.println(Name.length);

        // int[] marks = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // float avg, sum = 0;

        // int length = marks.length;
        // System.out.println("Length - " + length);

        // for (int mark : marks) {
        // sum += mark; // sum=sum+mark
        // System.out.println("Mark - " + mark);
        // System.out.println("Sum - " + sum);
        // }

        // avg=sum/length;
        // System.out.println("Avg - "+avg);

        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = 0; j < numbers[i].length; j++) {
        // System.out.println(numbers[i][j]);
        // }
        // }

        for (int[] row : numbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

        // System.out.println(numbers[0][0]);
        // System.out.println(numbers[0][1]);
        // System.out.println(numbers[0][2]);
        // System.out.println(numbers[0][3]);

        // System.out.println(numbers[1][0]);
        // numbers[1][0]=10;
        // System.out.println(numbers[1][0]);
        // System.out.println(numbers[1][1]);
        // System.out.println(numbers[1][2]);
        // System.out.println(numbers[1][3]);

    }
}
