package practice;

import java.util.Scanner;

public class Regex {

    private Scanner scanner = new Scanner(System.in);

    private String getValidInput(String prompt, String regex, String errorMessage) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (input.matches(regex)) {
                return input;
            } else if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            } else {
                System.out.println(errorMessage);
            }
        }
    }

    private String getValidPassword(String prompt) {
        String password;
        while (true) {
            System.out.println(prompt);
            password = scanner.nextLine();
            if (password.length() >= 10 &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*\\d.*")) {
                return password;
            } else {
                System.out.println("Password must be at least 10 characters long and contain at least one lowercase letter, one uppercase letter, and one digit.");
            }
        }
    }

    public boolean getValidData() {
        String firstName = getValidInput("Enter Your First Name:", "^[a-zA-Z]+$", "First name should only contain letters.");
        String lastName = getValidInput("Enter Your Last Name:", "^[a-zA-Z]+$", "Last name should only contain letters.");
        String email = getValidInput("Enter Your Email:", ".+@\\w+\\..+", "Invalid email format.");
        while (!email.endsWith("gmail.com")) {
            System.out.println("Email must end with @gmail.com. Please re-enter:");
            email = scanner.nextLine().trim();
        }
        String password = getValidPassword("Enter Your Password:");
        String confirmPassword;
        while (true) {
            confirmPassword = getValidInput("Enter Your Confirm Password:", ".*", "Confirm password cannot be empty.");
            if (confirmPassword.equals(password)) {
                break;
            } else {
                System.out.println("Confirm Password does not match Password. Please re-enter:");
            }
        }

        String prompt = "Thank you for using our system. Welcome " + firstName + " " + lastName;
        System.out.println(prompt);
        return true;
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.getValidData(); // The method now handles the loop internally
        regex.scanner.close();
    }
}