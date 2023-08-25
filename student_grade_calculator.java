import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        // Percentage problem

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks for Student Grade Calculator");
        System.out.print("Enter Marks 1 : ");
        float a = sc.nextFloat();
        System.out.print("Enter Marks 2 : ");
        float b = sc.nextFloat();
        System.out.print("Enter Marks 3 : ");
        float c = sc.nextFloat();
        System.out.print("Enter Marks 4 : ");
        float d = sc.nextFloat();
        System.out.println("Enter Marks 5 : ");
        float e = sc.nextFloat();
        float sum = a + b + c + d + e;
        float percentage = sum / 5;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks Obtained: " + sum);
        System.out.println("Obtained Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
