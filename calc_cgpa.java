import java.util.Scanner;

public class GPACalculator {

    public static void main(String[] args) {
        clearScreen();
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("                    GPA & CGPA Calculator (Developed by Nemo)             ");
        System.out.println("--------------------------------------------------------------------------\n");
        System.out.println("            MENU:");
        System.out.println("                   1. Calculate GPA (Grade Point Average)");
        System.out.println("                   2. Calculate CGPA (Cummulative Grade Point Average)");
        System.out.println("                   3. Method that is applied here for calclating GPA & CGPA");
        System.out.println("                   4. Exit Application");
        System.out.println("--------------------------------------------------------------------------");
        sub:
        while (true) {
            System.out.print("Enter your choice: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    calculateGPA();
                    break;
                case 2:
                    calculateCGPA();
                    break;
                case 3:
                    method();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have entered wrong input. Try again!\n");
                    continue sub;
            }
        }
    }

    public static void calculateGPA() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------- GPA Calculating -----------------");
        System.out.print(" How many subject's points do you want to calculate? : ");
        int q = scanner.nextInt();

        float[] credit = new float[q];
        float[] point = new float[q];

        System.out.println();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter the credit for the subject " + (i + 1) + ": ");
            credit[i] = scanner.nextFloat();
            System.out.println();
            System.out.print("Enter the point of the subject " + (i + 1) + ": ");
            point[i] = scanner.nextFloat();
            System.out.println("-----------------------------------\n\n");
        }

        float sum = 0;
        float tot;
        for (int j = 0; j < q; j++) {
            tot = credit[j] * point[j];
            sum += tot;
        }

        float totCr = 0;
        for (int k = 0; k < q; k++) {
            totCr += credit[k];
        }

        System.out.println("\n\n\nTotal Points: " + sum + " . Total Credits: " + totCr + " .Total GPA: " + (sum / totCr) + " .");

        sub:
        while (true) {
            System.out.println("\n\n\n1. Calculate Again");
            System.out.println("2. Go Back to Main Menu");
            System.out.println("3. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    calculateGPA();
                    break;
                case 2:
                    main(null);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
                    continue sub;
            }
        }
    }

    public static void calculateCGPA() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------- CGPA Calculating -----------------\n\n");
        System.out.print("How many semester results do you want input? :");
        int l = scanner.nextInt();
        System.out.println("\n\n");
        float[] semrs = new float[l];

        for (int i = 0; i < l; i++) {
            System.out.print(" Enter Semester " + (i + 1) + " Result(GPA): ");
            semrs[i] = scanner.nextFloat();
            System.out.println("\n");
        }

        float semtot = 0;
        for (int j = 0; j < l; j++) {
            semtot += semrs[j];
        }

        System.out.println("******** Your CGPA is " + (semtot / l) + " **********");

        sub:
        while (true) {
            System.out.println("\n\n\n1. Calculate Again");
            System.out.println("2. Go Back to Main Menu");
            System.out.println("3. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    calculateCGPA();
                    break;
                case 2:
                    main(null);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
                    continue sub;
            }
        }
    }

    public static void method() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------- Method of Calculating GPA & CGPA ---------------\n\n");
        System.out.println(" GPA= Sum of (Credit*Point) / total of credits \n");
        System.out.println(" CGPA=  Sum of GPA / number of semesters ");
        System.out.println("-----------------------------------------------------------------\n\n");

        sub:
        while (true) {
            System.out.println("1. Go Back to Main Menu");
            System.out.println("2. Exit This App \n\n");
            System.out.print("Your Input: ");
            int inmenu = scanner.nextInt();

            switch (inmenu) {
                case 1:
                    main(null);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("\n\nYou have Entered Wrong Input! Please Choose Again!");
                    continue sub;
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}