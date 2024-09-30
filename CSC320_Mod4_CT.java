import java.util.Scanner;

public class CSC320_Mod4_CT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float total = 0;
        float maxGrade = Float.NEGATIVE_INFINITY;
        float minGrade = Float.POSITIVE_INFINITY;

        System.out.println("You will enter 10 grades");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            float grade = scanner.nextFloat();

            total += grade;
            if (grade > maxGrade) {
                maxGrade = grade;
            }
            if (grade < minGrade) {
                minGrade = grade;
            }
        }

        float averageGrade = total / 10;

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Maximum Grade: " + maxGrade);
        System.out.println("Minimum Grade: " + minGrade);

        scanner.close();
    }
}
