package game;

import java.util.List;

public class View {
    public void printStartMessage()  {
        System.out.println("Программа загадала произвольное число в диапазоне от 0 до 100. Попробуйте угадать это число");
    }

    public void printBounds(int min, int max) {
        System.out.printf("Введите число от %d до %d%n", min, max);
    }

    public void printMessageGreaterNumber(int number) {
        System.out.printf("Число %d больше загаданного числа.%n", number);
    }

    public void printMessageLesserNumber(int number) {
        System.out.printf("Число %d меньше загаданного числа.%n", number);
    }


    public void printMessageGuessNumber(int number) {
        System.out.printf("Поздравляем! Вы угадали число %d!%n", number);
    }

    public void printMessageInputStatistics(List<Integer> stats) {
        System.out.println("Статистика по вашим действиям:");
        for (int i : stats) {
            System.out.print(i + " ");
        }
    }

    public void printMessageError() {
        System.out.println("Ошибка ввода\nПовторите попытку.");
    }
}