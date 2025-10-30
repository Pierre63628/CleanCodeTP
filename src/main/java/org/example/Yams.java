package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public Integer diceValue(List<Integer> dice) {
        int sum = 0;
        for (Integer value : dice) {
            sum += value;
        }
        return sum;
    }






}
