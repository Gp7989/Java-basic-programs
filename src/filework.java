/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filework {
    public static void main(String[] args) {
            String sourceFile = "source.txt";
            String destinationFile = "destination.txt";

            try {
                Scanner sc = new Scanner(new File(sourceFile));
                FileWriter fw = new  FileWriter(destinationFile);

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    fw.write(line + " ");
                }

                sc.close();
                fw.close();
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("Error during file copy: " + e.getMessage());
            }


            System.out.println("Copied File Content:");
            try {
                Scanner sc = new Scanner(new File(destinationFile));

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }

                sc.close();
            } catch (IOException e) {
                System.out.println("Error reading copied file: " + e.getMessage());
            }
        }
    }
}
*/