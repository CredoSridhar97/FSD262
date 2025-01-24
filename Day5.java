
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Strings - Text

class Day5 {
    public static void main(String args[]) {

        // Date and Time
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormtter

        LocalDate answer = LocalDate.now();
        System.out.println(answer);

        LocalTime answer1 = LocalTime.now();
        System.out.println(answer1);

        LocalDateTime answer2 = LocalDateTime.now();
        System.out.println(answer2);

        // index / position - 0, length - 1
        // String msg = "Sridhar Raj P";
        // System.out.println(msg);
        // System.out.println(msg.length());
        // System.out.println(msg.toUpperCase());
        // System.out.println(msg.toLowerCase());
        // System.out.println(msg.indexOf("S"));

        // String check="Credo Systemz";
        // System.out.println(check.charAt(6));

        // String FName="Sridhar";
        // String LName="Raj P";
        // System.out.println(FName+LName);
        // System.out.println(FName.concat(LName));

        // String Name="Sridhar Raj P.";
        // System.out.println(Name.startsWith("S"));
        // System.out.println(Name.endsWith("P."));

        // String Name = "CSZ";
        // System.out.println(Name.isEmpty());

        // String Name="HTML CSS JavaScript Java BootStrap Java";
        // System.out.println(Name.indexOf("Java"));
        // System.out.println(Name.lastIndexOf("Java"));

        // String Check = " Credo Systemz ";
        // System.out.println(Check);
        // System.out.println(Check.trim());

        // String Check = "Cat Call";
        // System.out.println(Check.replace("C", "B"));

        // String Check="Credo\tSystemz"; //\n - newline
        // System.out.println(Check);

        // System.out.println(Math.max(10, 90));
        // System.out.println(Math.min(10, 90));

        // System.out.println(Math.sqrt(64));

        // System.out.println(Math.abs(10 - 90));

        // // Math.random() - 4 Digit OTP, 6 Digit OTP

        // System.out.println(Math.random());

        // System.out.println(Math.sin(10));
        // System.out.println(Math.tan(10));
        // System.out.println(Math.acos(-1));

        // System.out.println(Math.floor(95.95));
        // System.out.println(Math.round(95.95));
    }
}