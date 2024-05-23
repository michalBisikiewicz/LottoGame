package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNumbers {
    public static List<Integer> values = new ArrayList<>();

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getRandomListWithNumbers();
    }

    public int getRandomNumber(int minRange, int maxRange) {
        return (int)(minRange + (Math.random() * (maxRange - minRange)));
    }

    public void getRandomListWithNumbers() {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter amount of number to randomly generate:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter min. value:");
        int min_range = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter max. value:");
        int max_range = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantity; i++) {
            values.add(getRandomNumber(min_range, max_range));
        }
        System.out.println(values);
    }
}
