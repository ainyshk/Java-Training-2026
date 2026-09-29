import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What operation do you want to do? (add, subtract, multiply, divide, mod, exponentiate, square root, cube root, or find the hypotenuse)\nWrite the input as first_number,operation,second_number (or number,operation for single numbers). Separate by a comma and NO SPACE: ");

        String user_input = scanner.next();

        // Declare variables outside the if blocks so the switch statement can access them
        float first_number = 0;
        float second_number = 0;
        float number = 0;
        String operation = "";

        // Count commas using .count()
        long commaCount = user_input.chars().filter(ch -> ch == ',').count();

        if (commaCount == 2) { // 3 values separated by 2 commas
            String[] user_array = user_input.split(",");
            first_number = Float.parseFloat(user_array[0]);
            operation = user_array[1];
            second_number = Float.parseFloat(user_array[2]);
        } 
        else if (commaCount == 1) { // 2 values separated by 1 comma
            String[] user_array = user_input.split(",");
            number = Float.parseFloat(user_array[0]);
            operation = user_array[1];
        } 
        else {
            System.out.println("Error! Please enter a valid input!");
            scanner.close();
            return; // Exit the program on invalid input
        }

        switch (operation) {
            case "add":
                System.out.println(first_number + second_number);
                break;
            case "subtract":
                System.out.println(first_number - second_number);
                break;
            case "multiply":
                System.out.println(first_number * second_number);
                break;
            case "divide":
                System.out.println(first_number / second_number);
                break;
            case "mod":
                System.out.println(first_number % second_number);
                break;
            case "exponentiate":
                System.out.println(Math.pow(first_number, second_number));
                break;
            case "square root":
                System.out.println(Math.sqrt(number)); // Use Math.sqrt for square root
                break;
            case "cube root":
                System.out.println(Math.cbrt(number)); // Use Math.cbrt for cube root
                break;
            default:
                System.out.println("Error! Please enter a valid operation!");
        }

        scanner.close();
    }
}