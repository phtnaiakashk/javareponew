Here's the equivalent Java code for the given C++ program:

```java
import java.util.Scanner; // Required for input operations

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // Use nextLine to read the entire line of input, including spaces
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        // Use nextInt to read the integer input for age
        int age = scanner.nextInt();

        // Print the entered name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner to free up resources
    }
}
```

### Key Differences:
- **Input Handling**: In Java, we use the `Scanner` class to handle input, whereas in C++ we use `cin` and `getline`.
- **Output**: Java uses `System.out.print` and `System.out.println` for output, while C++ uses `std::cout`.
- **String Handling**: Java's `String` class is used similarly to C++'s `std::string`.
- **Program Structure**: Java requires the code to be inside a class, and the `main` method must be `public static void`.