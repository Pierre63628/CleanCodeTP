package org.example;

import java.util.ArrayList;
import java.util.List;

public class Yams {


    public List<Integer> rollDice() {

        List<Integer> dice = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 6) + 1;
            dice.add(random);
        }
        return  dice;
    }



}
