package lotto;

import static lotto.InputNumbers.userNumbers;
import static lotto.RandomNumbers.values;

//@Data
public class App {
//    private final InputNumbers inputNumbers;
//    private final RandomNumbers randomNumbers;
//    private final CompareNumbers compareNumbers;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // allows user to input numbers and generate a list
        InputNumbers.getNumberOfInputs();
        InputNumbers.getNumbersFromUser();
        // generate random list of numbers to compare with users
        RandomNumbers.getRandomListWithNumbers();
        // compare 2 lists - random vs user
        CompareNumbers.listAreEqual(userNumbers, values);
    }
}