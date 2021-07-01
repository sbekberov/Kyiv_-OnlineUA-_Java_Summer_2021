package com.kpi;

import java.util.Scanner;

public class Controller {

    // fields

    private final Model _model;
    private final View _view;

    // constructor

    public Controller(Model model, View view) {
        _model = model;
        _view = view;
    }

    // methods

    public void execute() {
        Scanner sc = new Scanner(System.in);
        boolean isFirstPartCorrect = false;
        boolean isSecondPartCorrect = false;
        String firstPart = "";
        String secondPart = "";
        do {
            if(!isFirstPartCorrect) {
                firstPart = inputStringValueWithScanner(sc, View.INPUT_FIRST_PARAMETER);
                if(firstPart.isEmpty()) {
                    _view.printMessage(View.NULL_PARAMETER);
                    continue;
                }
                if(!firstPart.equals("Hello")) {
                    _view.printMessage(View.WRONG_FIRST_PARAMETER);
                    continue;
                }
                isFirstPartCorrect = true;
            }
            if(!isSecondPartCorrect) {
                secondPart = inputStringValueWithScanner(sc, View.INPUT_SECOND_PARAMETER);
                if(secondPart.isEmpty()) {
                    _view.printMessage(View.NULL_PARAMETER);
                    continue;
                }
                if(!secondPart.equals("world!")) {
                    _view.printMessage(View.WRONG_SECOND_PARAMETER);
                    continue;
                }
                isSecondPartCorrect = true;
            }

            _model.setFirstPart(firstPart);
            _model.setSecondPart(secondPart);
            System.out.println(_model);
            break;
        } while (true);
    }

    // The Utility methods

    public String inputStringValueWithScanner(Scanner sc, String request) {
        _view.printRequest(request);
        return sc.nextLine();
    }


}
