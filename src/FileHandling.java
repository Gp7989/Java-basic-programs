import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File myfile = new File("FileTesting.txt");
            if (myfile.exists()) {
                System.out.println("file exist");
            } else {
                myfile.createNewFile();
                System.out.println("file created");
            }

         /*   FileWriter writer = new FileWriter("FileTesting.txt");
            writer.write("welcomme  file ");
            writer.append("add some extra material");
            writer.close();


            FileReader reader = new FileReader("FileTesting.txt");
            Scanner obj = new Scanner(reader);
            while (obj.hasNext()){
                System.out.println(obj.nextLine());
            }
        }
          */
            if(myfile.delete()){
                System.out.println("delete");
            }
            else {
                System.out.println("error");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
