package lotto;

//@Data
public class App {

    RandomNumbers randomNumbers;
    CompareNumbers compareNumbers;
    InputNumbers inputNumbers;

    public App(RandomNumbers randomNumbers, CompareNumbers compareNumbers, InputNumbers inputNumbers) {
        this.randomNumbers = randomNumbers;
        this.compareNumbers = compareNumbers;
        this.inputNumbers = inputNumbers;
    }

    public static void main(String[] args) {
        App app = new App(new RandomNumbers(), new CompareNumbers(), new InputNumbers());
        app.run();
    }

    public void run() {
        // allows user to input numbers and generate a list
        inputNumbers.getNumberOfInputs();
        inputNumbers.getNumbersFromUser();
        // generate random list of numbers to compare with users
        randomNumbers.getRandomListWithNumbers();
        // compare 2 lists - random vs user
        compareNumbers.listAreEqual(inputNumbers.userNumbers, randomNumbers.values);
    }
}