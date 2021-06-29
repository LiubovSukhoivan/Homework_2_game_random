package EPAM.java.game.random;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startTheProgram() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(View.START_MESSAGE);
        int userInput;
        int userInputCheckResult;

        do {
            userInput = getInt(scanner);
            userInputCheckResult = model.checkUserInput(userInput);

            if (userInputCheckResult > 0) {
                view.printMessage(View.TOO_HIGH);
            } else if (userInputCheckResult < 0) {
                view.printMessage(View.TOO_LOW);
            }

        } while (userInputCheckResult != 0);

        view.printMessage(View.VICTORY);
        view.printStatistics(model.getAttempts());
    }

    private int getInt(Scanner scanner) {
        view.printHint(model.getMinNumber(), model.getMaxNumber());

        while (!scanner.hasNextInt()) {
            view.printMessage(View.INPUT_WRONG);
            view.printHint(model.getMinNumber(), model.getMaxNumber());

            scanner.next();
        }

        return scanner.nextInt();
    }
}