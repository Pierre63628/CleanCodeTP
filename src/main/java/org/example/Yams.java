package org.example;

import java.util.HashMap;
import java.util.Map;

public class Yams {





    public Map<Integer, Integer> rollDice() {
        Map<Integer, Integer> dice = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 6) + 1;
            if (dice.containsKey(random)) {
                dice.put(random, dice.get(random) + 1);
            } else {
                dice.put(random, 1);
            }
        }
        return  dice;
    }

    public Integer diceValue(Map<Integer, Integer> dice) {
        Integer sum = 0;
        for (Map.Entry<Integer, Integer> entry : dice.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }






}
