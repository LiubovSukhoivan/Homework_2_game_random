package EPAM.java.game.random;

import java.util.ArrayList;
import java.util.List;

    public class Model {
        private int minNumber;
        private int maxNumber;
        private final int guessedNumber;
        private final List<Integer> attempts;

        public Model() {
            this.minNumber = 0;
            this.maxNumber = 100;
            this.guessedNumber = (int) (Math.random() * 101);;
            this.attempts = new ArrayList<>();
        }

        public int getMinNumber() {
            return minNumber;
        }

        public int getMaxNumber() {
            return maxNumber;
        }

        public int getGuessedNumber() {
            return guessedNumber;
        }

        public List<Integer> getAttempts() {
            return attempts;
        }

        public int checkUserInput(int number) {
            if (number >= minNumber && number <= maxNumber) {
                addAttempt(number);

                if (number > guessedNumber && maxNumber > number) {
                    maxNumber = number;
                } else if (number < guessedNumber && minNumber < number) {
                    minNumber = number;
                }
            }
            return Integer.compare(number, guessedNumber);
        }

        private void addAttempt(int number) {
            if (!attempts.contains(number)) {
                attempts.add(number);
            }
        }
    }

