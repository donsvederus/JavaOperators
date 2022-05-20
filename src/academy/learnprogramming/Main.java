package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 -1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // % is modulus, the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        // result = result * 10;
        result *= 10;  // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I like aliens!");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You go the high score!");
        }
        if (topScore >= 100) {
            System.out.println("You still got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and leass then 100");
        }

        int secondTopScore2 = 81;
        if ((topScore > secondTopScore2) && (topScore < 100)) {
            System.out.println("Greater than second top score and less then 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen 1");
        }
        // short cut
        if (isCar) {
            System.out.println("This is not supposed to happen 2");
        }
        // not operator
        if (!isCar) {
            System.out.println("This is not supposed to happen 3");
        }

    }
}
