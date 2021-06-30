package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Controller {
    private final Model model;
    private final View view;

    private static final BufferedReader CONSOLE_READER = new BufferedReader(new InputStreamReader(System.in));

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void start() throws IOException {
        model.randInt();
        view.printStartMessage();
        while (true) {
            view.printBounds(model.getLowerBound(), model.getUpperBound());
            int number;
            try {
                number = Integer.parseInt(CONSOLE_READER.readLine());
            } catch (NumberFormatException e) {
                view.printMessageError();
                continue;
            }
            if (number > 100 || number < 0) {
                view.printMessageError();
                continue;
            }
            model.addNumber(number);
            if (model.numberGuessed()) {
                view.printMessageGuessNumber(number);
                view.printMessageInputStatistics(model.getEnteredValue());
                break;
            }
            if (model.numberIsGreater()) {
                view.printMessageGreaterNumber(number);
                model.setUpperBound(number);
            } else {
                view.printMessageLesserNumber(number);
                model.setLowerBound(number);
            }
        }
    }
}