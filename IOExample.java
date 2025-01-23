import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExample
{
    public static void main(String[] args) {
        File file = new File("src/example.txt");

        if (file.exists()){
            System.out.println("File exist:" + file.getName());
            System.out.println("Absolute Path:" + file.getAbsolutePath());

        }
        else {
            System.out.println("File doesnot exists." );
        }


    }
}
