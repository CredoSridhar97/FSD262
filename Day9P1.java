
import java.io.File;

public class Day9P1 {

    public static void main(String[] args) {
        File answer = new File("csz.txt");

        if(answer.delete())
        {
            System.out.println("Deleted - "+answer.getName());
        }
        else{
            System.out.println("Falied to delete the File");
        }

        // if (answer.exists()) {
        //     System.out.println(answer.getName());
        //     System.out.println(answer.getAbsolutePath());
        //     System.out.println(answer.canRead());
        //     System.out.println(answer.canWrite());
        //     System.out.println(answer.length());
        // } else {
        //     System.out.println("File does not exist");
        // }
    }

}
