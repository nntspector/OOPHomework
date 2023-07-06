package org.example.z3.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberGame numberGame = new NumberGame();
        List<Answer> gameHistory = new ArrayList<>();

        boolean gameRunning = true;
        while (gameRunning) {
            System.out.print("Введите размер слова: ");
            int sizeWord = scanner.nextInt();
            System.out.print("Введите максимальное количество попыток: ");
            int maxTry = scanner.nextInt();

            scanner.nextLine(); // Очистка буфера

            numberGame.start(sizeWord, maxTry);
            gameHistory.clear();

            while (numberGame.getGameStatus() != GameStatus.FINISH) {
                System.out.print("Введите значение: ");
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                if (answer != null) {
                    System.out.println("Ответ: " + answer);
                    gameHistory.add(answer);
                }
            }

            System.out.println("Игра завершена!");
            System.out.print("Хотите ли вы продолжить игру? (Да/Нет): ");
            String continueGame = scanner.nextLine();
            if (continueGame.equalsIgnoreCase("нет")) {
                gameRunning = false;
            }
        }
        System.out.println("История игры:");
        for (Answer answer : gameHistory) {
            System.out.println(answer);
        }
    }
}

