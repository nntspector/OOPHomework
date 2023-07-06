package org.example.z3.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    List<Answer> history;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("comp:  " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
        this.history = new ArrayList<>();
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы проиграли по количеству попыток");
            return null;
        }
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        Answer answer = new Answer(bull, cow, currentTry);
        history.add(answer);
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы Победили!!");
            return null;
        }
        return answer;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public List<Answer> getHistory() {
        return history;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }
}


