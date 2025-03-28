import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankApp {
    private String customerFirstName;
    private String customerLastName;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private Date birthDate;
    private String country;

    private static final Scanner scanner = new Scanner(System.in);

    private String getValidInput(String prompt) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Field cannot be empty. Please enter a valid value.");
            }
        } while (input.isEmpty());
        return input;
    }

    public String getUserFirstName() {
        this.customerFirstName = getValidInput("Welcome, please enter your Firstname:");
        return this.customerFirstName;
    }

    public String getUserLastName() {
        this.customerLastName = getValidInput("Please enter your Lastname:");
        return this.customerLastName;
    }

    public int getAge() {
        while (true) {
            String input = getValidInput("Please enter your Age:");
            try {
                int enteredAge = Integer.parseInt(input);
                if (enteredAge > 0) {
                    this.age = enteredAge;
                    return this.age;
                } else {
                    System.out.println("Age must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for age. Please enter a valid number.");
            }
        }
    }

    public String getUserGender() {
        this.gender = getValidInput("Please enter your Gender: Male or Female");
        return this.gender;
    }

    public String getEmail() {
        this.email = getValidInput("Please enter your Email: e.g.@gmail.com");
        return this.email;
    }

    public String getPhoneNumber() {
        this.phoneNumber = getValidInput("Please enter your Phone Number:");
        return this.phoneNumber; // Keeping it as String for flexibility
    }

    public String getAddress() {
        this.address = getValidInput("Please enter your home address:");
        return this.address;
    }

    public String getCity() {
        this.city = getValidInput("Please enter your City:");
        return this.city;
    }

    public String getState() {
        this.state = getValidInput("Please enter the state you're in:");
        return this.state;
    }

    public String getCountry() {
        this.country = getValidInput("Please enter your current Country:");
        return this.country;
    }

    public Date getBirthDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            String input = getValidInput("Please enter your birth date (YYYY-MM-DD):");
            try {
                this.birthDate = dateFormat.parse(input);
                return this.birthDate;
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }
    }

    public static String welcome() {
        return ("""
                \b GREAT!!!""");
    }

    public void registerUser() {
        customerFirstName = getUserFirstName();
        customerLastName = getUserLastName();
        email = getEmail();
        phoneNumber = getPhoneNumber();
    }

    public void postRegistration() {
        System.out.println("\n🎉 Registration Successful! 🎉");
        System.out.println("Welcome, " + customerFirstName + " " + customerLastName + "!");
        System.out.println("Your details:");
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);


        System.out.println("Your account has been created!");
        System.out.println("Welcome! :)");
    }

}
