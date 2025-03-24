//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();

//        int sum = calculation.add(7434, 808);

//        System.err.println("The output of add is : "+sum);

//        int sum1 = calculation.add(56, 76, 87, 800);

//        System.out.println("The result of add is : "+sum1);
//
        double power = calculation.power(2,5);

//        System.err.println(Math.sqrt(49));

//        System.out.println("The result of power is : "+power);

//        double interest = calculation.interest(75, 60, 10);
//        System.err.println("The simple interest is: " + interest);

//        String fahrenheit = calculation.fahrenheit();
//        System.out.println(fahrenheit);

//        double centigrade = calculation.centigrade(5);
//        System.err.println("Fahrenheit to Centigrade is: "+centigrade);

        Student student = new Student();
        System.out.println(student.studentName());
//        Student student2 = new Student("Ada", -7);
//        System.err.println(student2.studentName());
    }
}