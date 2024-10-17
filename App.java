// Angelo Andrade
// App.java
// 10/15/24
package angelo.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Zoo Program!");

        // Create the animal name lists
        AnimalNameLists animalNames = Utilities.createAnimalNameLists("C:\\Users\\BE218\\testing\\animalNames.txt");

        // Print the lists to verify
        System.out.println("Hyena Names: " + animalNames.getHyenaNameList());
        System.out.println("Lion Names: " + animalNames.getLionNameList());
        System.out.println("Bear Names: " + animalNames.getBearNameList());
        System.out.println("Tiger Names: " + animalNames.getTigerNameList());



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

        // Open arrivingAnimals with BufferedFileReader
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\zooMidterm\\arrivingAnimals.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Parse logic goes here (if needed)
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }

        // Input for the animal
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        String[] arrOfStrPatternOnComma = strStarting.split(", ");

        int elementNum = 0;
        for (String thePart : arrOfStrPatternOnComma) {
            System.out.println("Element " + elementNum + " of string: " + thePart);
            elementNum++;
        }
        System.out.println();
        String[] arrOfStrPartsOnSpace = arrOfStrPatternOnComma[0].split(" ");
        for( String thePart : arrOfStrPartsOnSpace) {
            System.out.println("Element " + elementNum + " of string:" + thePart);
        }
        System.out.println();
        String[] arrOfStrPartsOnSpace02 = arrOfStrPatternOnComma[1].split(" ");
        elementNum = 0;
        for( String thePart : arrOfStrPartsOnSpace02) {
            System.out.println("Element " + elementNum + " of string:" + thePart);
        }
        System.out.println();

        String ageInYears = arrOfStrPartsOnSpace[0];
        String animalBirthSeason = arrOfStrPartsOnSpace[3]; // Corrected index for season

        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);

        // Calculate the birthdate
        String animalBirthdate = calculateBirthdate(ageInYears, animalBirthSeason, strTodaysYear);
        System.out.println("\n animalBirthdate = " + animalBirthdate);

        // Testing the Animal constructor
        Animal myNewAnimal = new Animal("male", 12, 150, "Zig", "Hy01", animalBirthdate, "brown spots", "from San Diego Zoo");
        System.out.println("\n this is the new animal!");
        System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");
    }



    // Method to calculate the birthdate based on age and season
    private static String calculateBirthdate(String ageInYears, String animalBirthSeason, String strTodaysYear) {
        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        // Normalize the input season to lower case for case-insensitive comparison
        String season = animalBirthSeason.toLowerCase();

        switch (season) {
            case "spring":
                animalBirthdate = animalBirthYear + "-03-21";
                break;
            case "fall":
                animalBirthdate = animalBirthYear + "-09-21";
                break;
            case "winter":
                animalBirthdate = animalBirthYear + "-12-21";
                break;
            case "summer":
                animalBirthdate = animalBirthYear + "-06-21";
                break;
            default:
                animalBirthdate = animalBirthYear + "-01-01"; // Default case for anything else
                break;
        }

        return animalBirthdate;
    }



}
