import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter your height in centimeter:");
        double height = scanner.nextDouble();
        
        double c = weight /( (height * height)/100);
        double bmi = c*100;
        System.out.printf("Your BMI is = "+bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should eat more.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is normal. Keep up the good work!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight. You should try to walk 30 minutes per day.");
        } else {
            System.out.println("You are obese. You should try to walk 60 minutes per day.");
        }
        
        scanner.close();
    }
}
