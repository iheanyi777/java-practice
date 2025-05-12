import java.util.Scanner;

public class Calculation {

    //todo - create a method to add 2 numbers

    // todo (1)  create a method that will add 4 numbers  test in main

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }


    //todo : (2) take two params and return a raised to power b

    public double power(int a, int b) {
        double power = Math.pow(a,b);
        return power;
    }
    //Ass 1
    public int add(int a, int b, int c, int d) {
        int sum1 = a + b + c + d;
        return sum1;
    }
    //Ass 2 write a simple method that takes principal rate and time and calculates simple interest


    public double interest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    // write a java method to convert from Centigrade to Fahrenheit
    // write a java method to convert from Fahrenheit to Centigrade
    // read about java.util.Scanner class
    //create a method called grade to return students grade in string e.g. between 100 and 75 => "A"

    public String fahrenheit(){

        Scanner sc = new Scanner(System.in);

        System.err.println("Hii welcome to temp calculation \nPlease enter your temperature in Centigrade" );
        String input = sc.nextLine();


        // temp must be within 1 to 100 centigrade
        // temp cannot be empty
        if (input == null || input.trim().isEmpty()) {
            return "Input cannot be empty. Enter a valid temperature in Centigrade!";
        }

        try {
            double number = Double.parseDouble(input);
            System.err.println("yhh your input is: "+input);
            double value =  (number * 9/5) + 32;
            if (number < 1 || number > 100) {
                return "Invalid input! Please enter a valid temperature between 1 and 100 in Centigrade!";
            }else {
                return number + " in Centigrade is equal to " + value + " in Fahrenheit";
            }


        }

        catch (NumberFormatException e){
            return "Sorry you can only input numbers";
        }

        catch (Exception e){

            return "An error occurred";

        }

    }

    public double centigrade(double Fahrenheit){
        return (Fahrenheit - 32) * 5/9;
    }


}


