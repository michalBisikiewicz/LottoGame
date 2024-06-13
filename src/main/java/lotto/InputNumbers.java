package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNumbers {
    public List<Integer> userNumbers = new ArrayList<>();
    public static String numberOfUserInputs;
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InputNumbers inputNumbers = new InputNumbers();
        inputNumbers.getNumberOfInputs();
        inputNumbers.getNumbersFromUser();
    }

    public String getNumberOfInputs() {
        System.out.println("Please enter number of inputs.");
        numberOfUserInputs = scanner.nextLine();
        return numberOfUserInputs;
    }

    public void getNumbersFromUser() {
        String key;
        int counter = 0;
        int amount = Integer.parseInt(numberOfUserInputs);

        System.out.println("Enter " + amount + " values.");
        while (counter < amount) {
            if (scanner.hasNextInt()) {
                key = scanner.nextLine();
                int userInput = Integer.parseInt(key);
                userNumbers.add(userInput);
                counter++;
            }
            else {
                System.out.println("Enter a number.");
                scanner.nextLine();
            }
        }
        System.out.println("Your picked numbers are: " + userNumbers);

    }
}