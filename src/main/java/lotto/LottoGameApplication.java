package lotto;

public class LottoGameApplication {

    public static void main(String[] args) {
        System.out.println("System is not working properly. Try again");
        double random = getRandomNumber();
        System.out.println(random);
        System.out.println("End game");
    }

    private static double getRandomNumber() {
        return Math.random();
    }
}