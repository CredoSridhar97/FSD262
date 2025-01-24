
// 1. without arg, without return type
// 2. with arg, without return type
// 3. without arg, with return type
// 4. with arg, with return type

// public class Day6 {
//     // static void display() {
//     // System.out.println("Welcome to Credo Systemz");
//     // }

//     // 1. without arg, without return type
//     // static void add() {
//     // int a = 90;
//     // int b = 90;
//     // int c = a + b;
//     // System.out.println(c);
//     // }

//     // 2. with arg, without return type

//     // static void add(int a, int b) {
//     // System.out.println(a + b);
//     // }

//     // 3. without arg, with return type

//     // static int add() {
//     // int a = 10;
//     // int b = 5;
//     // return a + b;
//     // }

//     // 4. with arg, with return type

//     static int add(int a, int b, int c, int d, int e) {
//         return a + b + c + d + e;
//     }

//     public static void main(String args[]) {
//         // display();
//         // add();
//         // add(100,50);
//         // System.out.println(add());
//         System.out.println(add(1, 2, 3, 4, 5));
//     }
// }

// public class Day6 {
//     static void myMethod(String FName, String LName, int Age, String DOB, double Salary) {
//         System.out.println(FName + " " + LName + " " + Age + " " + DOB + " " + Salary);
//     }

//     public static void main(String[] args) {
//         myMethod("Sridhar", "Raj P", 27, "09/12/1997", 40000);
//     }
// }

// public class Day6 {
//     static void checkAge(int age) {
//         if (age >= 18) {
//             System.out.println("Access Grand");
//         } else {
//             System.out.println("Access Denied");
//         }
//     }

//     public static void main(String[] args) {

//         checkAge(15);
//     }
// }

//Method Overloading - multiple methods - same name with different parameters 

// public class Day6 {
//     static int add(int a, int b) {
//         return a + b;
//     }

//     static double myadd(double a, double b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         int answer = add(10, 10);
//         System.out.println(answer);
//         double answer1 = myadd(10.5, 10.2);
//         System.out.println(answer1);
//     }
// }

public class Day6 {
    static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
            // 10+sum(10-1=9)
            // 10+9+sum(8)
            // 10+9+8+sum(7)
            // 10+9+8+7+sum(6)
            // 10=9+8+7+6+sum(5)
            // .... 10+9+8+7+6+5+4+3+2+1+sum(1-0=0)
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}