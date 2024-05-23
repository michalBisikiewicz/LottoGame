package lotto;

import static lotto.InputNumbers.userNumbers;
import static lotto.RandomNumbers.values;

//@Data
public class App {

    RandomNumbers randomNumbers = new RandomNumbers();
    CompareNumbers compareNumbers = new CompareNumbers();
    InputNumbers inputNumbers = new InputNumbers();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        // allows user to input numbers and generate a list

        InputNumbers.getNumberOfInputs();
        inputNumbers.getNumbersFromUser();
        // generate random list of numbers to compare with users
        randomNumbers.getRandomListWithNumbers();
        // compare 2 lists - random vs user
        compareNumbers.listAreEqual(userNumbers, values);
    }
}