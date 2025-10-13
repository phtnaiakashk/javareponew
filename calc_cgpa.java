Below is the Java equivalent of the provided C++ code. Note that Java does not support the `goto` statement, so I've replaced it with loops for handling repeated input prompts. Additionally, Java does not have a direct equivalent to `system("cls")`, so I've omitted that functionality.

```java
import java.util.Scanner;

public class GPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("                    GPA & CGPA Calculator (Developed by Nemo)             ");
            System.out.println("--------------------------------------------------------------------------\n");
            System.out.println("            MENU:");
            System.out.println("                   1. Calculate GPA (Grade Point Average)");
            System.out.println("                   2. Calculate CGPA (Cummulative Grade Point Average)");
            System.out.println("                   3. Method that is applied here for calculating GPA & CGPA");
            System.out.println("                   4. Exit Application");
            System.out.println("--------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    calculateGPA(scanner);
                    break;
                case 2:
                    calculateCGPA(scanner);
                    break;
                case 3:
                    method(scanner);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have entered wrong input. Try again!\n");
            }
        }
    }

    public static void calculateGPA(Scanner scanner) {
        System.out.println("-------------- GPA Calculating -----------------");
        System.out.print("How many subject's points do you want to calculate? : ");
        int q = scanner.nextInt();

        float[] credit = new float[q];
        float[] point = new float[q];

        for (int i = 0; i < q; i++) {
            System.out.print("Enter the credit for the subject " + (i + 1) + ": ");
            credit[i] = scanner.nextFloat();
            System.out.print("Enter the point of the subject " + (i + 1) + ": ");
            point[i] = scanner.nextFloat();
            System.out.println("-----------------------------------\n");
        }

        float sum = 0;
        for (int j = 0; j < q; j++) {
            sum += credit[j] * point[j];
        }

        float totCr = 0;
        for (int k = 0; k < q; k++) {
            totCr += credit[k];
        }

        System.out.println("\n\n\nTotal Points: " + sum + " . Total Credits: " + totCr + " .Total GPA: " + (sum / totCr) + " .");

        while (true) {
            System.out.println("\n\n\n1. Calculate Again");
            System.out.println("2. Go Back to Main Menu");
            System.out.println("3. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    calculateGPA(scanner);
                    return;
                case 2:
                    return;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
            }
        }
    }

    public static void calculateCGPA(Scanner scanner) {
        System.out.println("-------------- CGPA Calculating -----------------\n\n");
        System.out.print("How many semester results do you want input? : ");
        int l = scanner.nextInt();
        System.out.println("\n\n");

        float[] semrs = new float[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter Semester " + (i + 1) + " Result(GPA): ");
            semrs[i] = scanner.nextFloat();
            System.out.println("\n");
        }

        float semtot = 0;
        for (int j = 0; j < l; j++) {
            semtot += semrs[j];
        }

        System.out.println("******** Your CGPA is " + (semtot / l) + " **********");

        while (true) {
            System.out.println("\n\n\n1. Calculate Again");
            System.out.println("2. Go Back to Main Menu");
            System.out.println("3. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    calculateCGPA(scanner);
                    return;
                case 2:
                    return;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
            }
        }
    }

    public static void method(Scanner scanner) {
        System.out.println("--------------- Method of Calculating GPA & CGPA ---------------\n\n");
        System.out.println("GPA= Sum of (Credit*Point) / total of credits \n");
        System.out.println("CGPA=  Sum of GPA / number of semesters ");
        System.out.println("-----------------------------------------------------------------\n\n");

        while (true) {
            System.out.println("1. Go Back to Main Menu");
            System.out.println("2. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    return;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
            }
        }
    }
}
```

This Java program uses a `Scanner` for input and handles menu navigation using loops instead of `goto`. The `main` method is the entry point, and the program continues to run until the user chooses to exit.