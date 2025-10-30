import org.example.Yams;
import org.junit.jupiter.api.Test;

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
    public  void testRollDiceValuesNoPattern() {
        Yams yams = new Yams();
        Integer dice = yams.diceValue(Map.of(1, 3, 2, 2, 3, 1, 4, 1, 5, 1, 6, 1));
        assertEquals(9, dice);
        }


    @Test
    public void testRollDiceValuesBrelan() {
        Yams yams = new Yams();
        Integer dice = yams.diceValue(Map.of(
                1, 3,
                2, 1,
                3, 1,
                4, 1));
        assertEquals(28, dice);
        }
}




