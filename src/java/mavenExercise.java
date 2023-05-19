import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class mavenExercise {
    public static void main(String[] args) {
        //get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        //check if the user entered a number
        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.println("This is a number");
        }else {
            System.out.println("This is not a number");
        }

        //flip the case of the string
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        //reverse the string
        System.out.println("Reverse: " + StringUtils.reverse(userInput));

    }
}