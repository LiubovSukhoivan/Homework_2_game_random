package EPAM.java.game.random;

import java.util.List;

public class View {

        public static final String START_MESSAGE = "Try guess the number";
        public static final String ENTERED_NUMBER = "Entered number";
        public static final String INPUT_WRONG = "It's not a number! Try again!";
        public static final String VICTORY = "You win!";
        public static final String TOO_HIGH = "The number is bigger! Enter the number below";
        public static final String TOO_LOW = "The number is less! Enter the number above";

        public void printMessage(String message) {
            System.out.println(message);
        }

        public void printHint(int minNumber, int maxNumber) {
            System.out.println(ENTERED_NUMBER + " between " + minNumber + " and " + maxNumber);
        }

        public void printStatistics(List<Integer> attempts) {
            System.out.print("Statistics: ");

            for (int i = 0; i < attempts.size(); i++) {
                System.out.print(attempts.get(i));

                if (i < attempts.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }