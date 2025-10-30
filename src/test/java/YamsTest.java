import org.example.Yams;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YamsTest {


    @Test
    public void testRollDice() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();
        assertTrue(dice.size() >= 1 && dice.size() <= 5);
    }

    @Test
    public void testRollDiceValues() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();
        dice.values().forEach(
                value ->
                        assertTrue(value >= 1 && value <= 6));
    }

    @Test
    public  void testRollDiceValues2() {
        Yams yams = new Yams();
        Integer dice = yams.diceValue(List.of(1, 2, 3, 4, 5));
        assertEquals(15, dice);
        }
    }



