package lotto;

public class LottoGameApplication {

    public static void main(String[] args) {
        System.out.println("System is not working properly");
        double random = getRandomNumber();
        System.out.println(random);
    }

    private static double getRandomNumber() {
        return Math.random();
    }
}