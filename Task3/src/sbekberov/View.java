package sbekberov;

import java.util.ArrayList;

public class View {
    public static final String NAME = "Введите имя : ";
    public static final String SURNAME = "Ведите фамилию :";
    public static final String MIDDLE_NAME = "Введите отчество : ";
    public static final String PHONE_NUMBER = "Введите номер телефона. Например: +380(xx)xxxxxxx :";
    public static final String EMAIL = "Введите електронную почту : ";
    public static final String NICKNAME = "Введите nickname. Например : @xxххx";
    public static final String USERS = "Зарегистрированные пользователи : ";
    public static final String CONTINUE = "Добавить нового пользователя? (+ или -)";
    public static final String ERROR = "Некорректные данные. Повторите попытку.";
    public static final String USER_IS_ADDED = "Пользователь добавлен.";

    public void requestName() {
        System.out.println(NAME);
    }

    public void requestSurname() {
        System.out.println(SURNAME);
    }

    public void requestMiddleName() {
        System.out.println(MIDDLE_NAME);
    }

    public void requestPhoneNumber() {
        System.out.println(PHONE_NUMBER);
    }

    public void requestEmail() {
        System.out.println(EMAIL);
    }

    public void requestNickname() {
        System.out.println(NICKNAME);
    }

    public void showUsers(ArrayList<String> usersData) {
        System.out.println(USERS);
        for (String user : usersData) {
            System.out.println(user);
        }
    }

    public void requestToContinue() {
        System.out.println(CONTINUE);
    }

    public void showErrorMessage() {
        System.out.println(ERROR);
    }

    public void showAddUser() {
        System.out.println(USER_IS_ADDED);
    }
}