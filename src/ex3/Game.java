package org.example.z3.q2;

import java.util.List;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    List<Answer> getHistory();
}


