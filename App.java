// Angelo Andrade
// App.java
// 10/15/24
package angelo.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Zoo Program!");

        // This is all the date stuff we did last week
        // The current date
        Date today = new Date();
        // Correct format for today's date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("\n today's date is: " + strTodaysDate);

        // parse the string
        // Open arrivingAnimals with BufferedFileReader

        BufferedReader reader = null;

        try {
            // Create a BufferedReader object to read from the file
            reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\IdeaProjects\\animalClasses\\src\\angelo\\zoo\\com\\arrivingAnimals.txt"));

            String line;
            // Read lines from the file until the end is reached
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);

                // Parse

                


            }
        } catch (IOException e) {
            // Handle potential IO exceptions
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            // Close the BufferedReader to free up resources
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }


        // Input for the animal



    }
}
