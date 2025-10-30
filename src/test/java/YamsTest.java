import org.example.Yams;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YamsTest {


    @Test
    public void rollDice() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();
        assertTrue(dice.size() >= 1 && dice.size() <= 5);
    }

    @Test
    public void calcualteDiceValues() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();
        dice.values().forEach(
                value ->
                        assertTrue(value >= 1 && value <= 6));
    }

    @Test
    public  void calcualteDiceValuesNoPattern() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 1,
                3, 2,
                5, 1,
                6, 1));
        assertEquals(15, dice);
        }


    @Test
    public void calcualteDiceValuesBrelan() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 3,
                3, 1,
                4, 1));
        assertEquals(28, dice);
        }

     @Test
    public void calcualteDiceValuesCarre() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 4,
                2, 1));
        assertEquals(35, dice);
        }

        @Test
    public void calcualteDiceValuesFull() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 3,
                2, 2));
        assertEquals(30, dice);
        }

        @Test
    public void calcualteDiceValuesYams() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 5));
        assertEquals(50, dice);
        }

        @Test
    public void calcualteDiceValuesGrandeSuite() {
        Yams yams = new Yams();
        Integer dice = yams.calcualteDiceValue(Map.of(
                1, 1,
                2, 1,
                3, 1,
                4, 1,
                5, 1));
        assertEquals(40, dice);
        }
}




