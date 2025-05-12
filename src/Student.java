import java.util.Scanner;

public class Student {

    public Student() {

    }
    private String name;
    private int score;


    public String studentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome pupil, please enter your name:");
        String inputName = scanner.nextLine();

        if (inputName == null || inputName.trim().isEmpty()) {
            return "Name cannot be empty. Please enter a valid name!";
        }



        this.name = inputName;

        System.out.println("Please enter your score:");

        int inputScore;

        try {
            inputScore = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return "Invalid input for score. Please enter a valid number.";
        }
        this.score = inputScore;

        
        if (score < 0 || score > 100) {
            return "Invalid grade";
        } else if (score >= 75) {
            return name + ". Yay, you have an A";
        } else if (score >= 60) {
            return "Great " + name + ", you have a B";
        } else if (score >= 50) {
            return name + ". OK, a C";
        } else if (score >= 40) {
            return name + ". Huh, a P";
        } else {
            return "WOW; " + name + ", why did you Fail";
        }
////        return grade();
    }


//    public String grade() {
//        if (score < 0 || score > 100) {
//            return "Invalid grade";
//        } else if (score >= 75) {
//            return name + ". Yay, you have an A";
//        } else if (score >= 60) {
//            return "Great " + name + ", you have a B";
//        } else if (score >= 50) {
//            return name + ". OK, a C";
//        } else if (score >= 40) {
//            return name + ". Huh, a P";
//        } else {
//            return "WOW; " + name + ", why did you Fail";
//        }
//    }
}
