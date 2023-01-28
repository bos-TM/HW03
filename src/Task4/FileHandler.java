package Task4;

import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        try {
            // Create a new file in the package directory
            File file = new File("textfile.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write some text to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is some text in the file.");
            writer.close();

            // Read the contents of the file and print to the console
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
