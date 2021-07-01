package com.kpi;

public class View {

    // text constants

    public static final String WRONG_FIRST_PARAMETER = "Wrong first parameter! Repeat, please!";
    public static final String WRONG_SECOND_PARAMETER = "Wrong second parameter! Repeat, please!";
    public static final String NULL_PARAMETER = "Parameter is empty! Repeat, please!";
    public static final String INPUT_FIRST_PARAMETER = "Input first value: ";
    public static final String INPUT_SECOND_PARAMETER = "Input second value: ";

    // methods

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRequest(String request) {
        System.out.print(request);
    }


}
