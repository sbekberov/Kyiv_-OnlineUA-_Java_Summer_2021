package sbekberov;


import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    private static final Scanner CONSOLE = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void registerUser() {
        newUser:
        while (true) {
            String[] user = new String[6];
            for (int i = 0; i < user.length; i++) {
                requestUser(i);
                String answer = CONSOLE.nextLine();
                if (processUser(answer, i)) {
                    user[i] = answer;
                } else {
                    view.showErrorMessage();
                    continue newUser;
                }
            }
            model.addUser(new User(user));
            view.showAddUser();
            view.requestToContinue();
            while (true) {
                String continueProcess = CONSOLE.nextLine();
                if (continueProcess.equals("-")) break newUser;
                else if (continueProcess.equals("+")) continue newUser;
                else view.requestToContinue();
            }
        }
        ArrayList<String> userData = new ArrayList<>();
        for (User p : model.getUsers()) {
            userData.add(p.toString());
        }
        view.showUsers(userData);
    }


    public void requestUser(int question) {
        switch (question) {
            case 0:
                view.requestName();
                break;
            case 1:
                view.requestSurname();
                break;
            case 2:
                view.requestMiddleName();
                break;
            case 3:
                view.requestPhoneNumber();
                break;
            case 4:
                view.requestEmail();
                break;
            case 5:
                view.requestNickname();
                break;
            default:
                throw new IndexOutOfBoundsException("No questions for this index");
        }
    }

    public boolean processUser(String input, int question) {
        switch (question) {
            case 0:
                return input.matches("^[A-ZA-Я]?[a-zа-я]+");
            case 1:
                return input.matches("^[A-ZA-Я]?[a-zа-я]+");
            case 2:
                return input.matches("^[A-ZA-Я]?[a-zа-я]+");
            case 3:
                return input.matches("^(\\+?[1-9])[0-9]{9,12}");
            case 4:
                return input.matches("^\\w+\\.?+\\w+@\\w+\\.\\w{2,}$");
            case 5:
                return input.matches("^@\\w{3,10}$");
            default:
                throw new IndexOutOfBoundsException("No questions for this index");
        }
    }
}