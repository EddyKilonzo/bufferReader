
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args)  throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name:...");
        String name = reader.readLine();
        System.out.println("Enter age:....");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Enter reg number:");
        String reg =   reader.readLine();
        System.out.println("Enter your course:...");
        String course = reader.readLine();
        System.out.println("Name.. " + name + "\n Age:.."+ age + "\n Registration_Num:.." + reg + "\n Course:.."+ course);


        reader.close();
    }
}