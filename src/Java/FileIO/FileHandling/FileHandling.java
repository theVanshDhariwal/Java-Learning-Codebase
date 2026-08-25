package Java.FileIO.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("vansh.txt");

        file.createNewFile();

        FileWriter fileWriter = new FileWriter("vansh.txt");
        fileWriter.write("Hello my name is Vansh Dhariwal.\nWhat's your name?");
        fileWriter.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        Thread.sleep(5000);
        File file2 = new File("vansh.txt");

//        if (file2.delete()) {
//            System.out.println("I deleted the file.");
//        }
    }
}
