package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {

    public String calculatesLengthOfString() {
        // todo: first get the users input in a string variable
        //todo : check if there is a number in it

        Scanner scanner = new Scanner(System.in);
        String message = "";
        while (true) {
            System.out.println("Please enter your name: ");
            String input = scanner.nextLine();
            if (checkForValidInput(input)) {
                message = "Your name is " + input + " and the length is " + input.length();
                break;

            } else {
                System.out.println("Please enter a valid name: ");
            }

        }
        return message;

    }

    public boolean checkForValidInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isAlphabetic(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkForValidInput2(String input) {
        return input.matches("[a-zA-Z]+");
    }


    public String reverseString(String input) {
        String exampleName = "Backwards";
        String reversedName = "";
        for (int i = exampleName.length() - 1; i >= 0; i--) {
            reversedName = reversedName + exampleName.charAt(i);
        }
        return "An example of a word reversed is: " + reversedName;
    }

    public boolean isValidPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your password: ");
        String input = scanner.nextLine();
       if (input == null){
           return false;
       }
       if(!input.matches(".*[a-z].*") ||
               !input.matches(".*[A-Z].*") ||
               !input.matches(".*[a-zA-Z0-9].*") ||
               input.matches("^[0-9].*") ||
               input.length() < 10 ||
               !input.matches(".*\\d.*")){
            return false;
        }
       return true;
    }

//    public static void main(String[] args) {
//        String input = "emeku";
//        System.err.println(input.matches(".*[abc]"));
//    }


//    Find out if there are any occurrences of the word "w3schools" in a sentence:
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

//   Brackets are used to find a range of characters:
//    [abc]	Find one character from the options between the brackets
//[^abc]	Find one character NOT between the brackets
//[0-9]	Find one character from the range 0 to 9

//    Metacharacters are characters with a special meaning:
//    |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
//.	Find just one instance of any character
//^	Finds a match as the beginning of a string as in: ^Hello
//$	Finds a match at the end of the string as in: World$
//\d	Find a digit
//\s	Find a whitespace character
//\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
//\xxxx	Find the Unicode character specified by the hexadecimal number xxxx


//    Quantifiers define quantities:
//    n+	Matches any string that contains at least one n
//n*	Matches any string that contains zero or more occurrences of n
//n?	Matches any string that contains zero or one occurrences of n
//n{x}	Matches any string that contains a sequence of X n's
//n{x,y}	Matches any string that contains a sequence of X to Y n's
//n{x,}	Matches any string that contains a sequence of at least X n's

}





