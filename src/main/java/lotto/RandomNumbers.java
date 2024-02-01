package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNumbers {
    public static List<Integer> values = new ArrayList<>();

    public static void main(String[] args) {
        getRandomListWithNumbers();
    }

    public static int getRandomNumber(int min_range, int max_range) {
        return (int)(min_range + (Math.random() * (max_range - min_range)));
    }

    public static void getRandomListWithNumbers() {
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
