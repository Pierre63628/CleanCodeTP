package org.example;

import java.util.HashMap;
import java.util.Map;

public class Yams {

    private static final Map<String, Integer> POSSIBLE_COMBINATIONS = Map.of(
        "BRELAN", 28,
        "CARRE", 35,
        "FULL", 30,
        "GRANDE_SUITE", 40,
        "YAMS", 50
    );
    //Map<Number,Interation>
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

        if (dice.containsValue(2) && dice.containsValue(3)) {
            return POSSIBLE_COMBINATIONS.get("FULL");
        }
        if (dice.containsValue(3)) {
            return POSSIBLE_COMBINATIONS.get("BRELAN");
        }
        if (dice.containsValue(4)) {
            return POSSIBLE_COMBINATIONS.get("CARRE");
        }
        if (dice.containsValue(5)) {
            return POSSIBLE_COMBINATIONS.get("YAMS");
        }else {
            for (Map.Entry<Integer, Integer> entry : dice.entrySet()) {
                sum += entry.getKey();
            }
            return sum;
        }

}
}