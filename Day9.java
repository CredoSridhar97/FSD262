import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Day9 {
    public static void main(String args[]) {
        try {
            File answer = new File("Day8.java");
            Scanner readdata = new Scanner(answer);
            while (readdata.hasNextLine()) {
                String data = readdata.nextLine();
                System.out.println(data);
            }
            readdata.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
        }

    }
}