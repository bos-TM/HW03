package Task2;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Create a new file and write data to it
            File file = new File("example.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is some example data.");
            writer.close();

            // Open the file and read the data
            FileReader reader = new FileReader(file);
            char[] buffer = new char[(int) file.length()];
            reader.read(buffer);
            reader.close();

            // Print the data to the console
            System.out.println(new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
