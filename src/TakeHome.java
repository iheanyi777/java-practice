import java.time.LocalDate;
import java.util.Scanner;

/**
 * This class is about ....
 * @author Iheanyi
 */
public class TakeHome {

    private static final Scanner use = new Scanner(System.in);

    private int getValidData(String type) {
        int data;

        while (true) {

            String input = use.nextLine().trim();

            try {
                data = Integer.parseInt(input);

                if (data <= 0) {
                    System.out.println("Enter a value greater than 0.");
                } else if (data > 120 && type.equalsIgnoreCase("year")) {
                    System.err.println("Invalid age " + data + ", age must be below 120");
                }else{
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return data;
    }


// Age


    public String getAgeAndYearBorn() {
        System.out.println("Welcome user, please enter your age: ");
        int data = getValidData("year");
        int year = LocalDate.now().getYear() - data;

        return "Your age is " + data + ", you were born in the year " + year;


    }


//OR1


    public String getAgeAndYearBorn1() {
        System.out.println("Welcome, please enter an age:");
        int data = getValidData("Year");

        int birthYear = LocalDate.now().getYear() - data;


        String birthYearString;
        if (birthYear >= 1) {
            birthYearString = birthYear + " AD"; // Years after 1 AD
        } else {
            birthYearString = Math.abs(birthYear - 1) + " BC"; // BC years
        }

        return "Your age is " + data + " and you were born in the year " + birthYearString;
    }


// Leap year


    public boolean getTheLeapYear() {
        System.out.println("Please, enter a year:");
        int year = getValidData("year");
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }


// Volume of a shape


    public String getVolumeOfShape() {
        System.out.println("Please, enter the required values in the order (height, width, and length) to get the volume in cm. If your units are not in cm, kindly convert to centimeters before inputting: ");
        double height = getValidData("");
        double width = getValidData("");
        double length = getValidData("");
        String h = "Height: " +height + "cm";
        System.out.println(h);
        String w = "Width: " +width + "cm";
        System.out.println(w);
        String l = "Length: " +length + "cm";
        System.out.println(l);
        double volume = width * height * length;
        String beginning = "The volume of your shape is ";
        String end = "cm Cube";
        return beginning + volume + end;
    }
}
