import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\USER\\Downloads\\download1.jpeg");
            FileOutputStream out = new FileOutputStream("copiedimage");
            int byteData;
            while ((byteData = in.read()) != -1) ;
            out.write(byteData);
            System.out.println("Image copied sucessfully!");
        }

      catch (IOException e){
            e.printStackTrace();
        }
    }

}
