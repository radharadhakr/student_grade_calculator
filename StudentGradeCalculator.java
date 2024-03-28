import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        
       
        while (numSubjects <= 0) {
            System.out.println("Invalid input. Please enter a positive number for the number of subjects:");
            numSubjects = scanner.nextInt();
        }
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Please enter marks between 0 and 100:");
                marks = scanner.nextInt();
            }
            
            totalMarks += marks;
        }
        
        double averagePercentage = (double) totalMarks / numSubjects;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}