import java.util.Scanner;

public class IT26100096Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    public static String findGrades(double finalMark) {

        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 65)
            return "B";
        else if (finalMark >= 50)
            return "C";
        else
            return "F";
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println("Name       : " + name);
        System.out.println("Final Mark : " + finalMark);
        System.out.println("Grade      : " + grade);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Assignment Mark: ");
            double assignment = sc.nextDouble();

            System.out.print("Exam Mark: ");
            double exam = sc.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        sc.close();
    }
}