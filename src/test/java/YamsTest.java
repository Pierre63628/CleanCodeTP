import org.example.Yams;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YamsTest {

    @Test
    public void shouldReturnValidDiceCountWhenRolling() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();

        assertThat(dice.size())
                .as("Dice count should be between 1 and 5")
                .isBetween(1, 5);
    }

    @Test
    public void shouldReturnValidDiceValuesWhenRolling() {
        Yams yams = new Yams();
        Map<Integer, Integer> dice = yams.rollDice();

        dice.values().forEach(value ->
                assertThat(value)
                        .as("Each die value should be between 1 and 6")
                        .isBetween(1, 6));
    }

    @Test
    public  void calcualteDiceValuesNoPattern() {
        Yams yams = new Yams();

        Integer dice = yams.calculateScore(Map.of(
                1, 1,
                3, 2,
                5, 1,
                6, 1));
        assertEquals(15, dice);
    }

    @Test
    public void calcualteDiceValuesBrelan() {
        Yams yams = new Yams();
        Integer dice = yams.calculateScore(Map.of(
                1, 3,
                3, 1,
                4, 1));
        assertEquals(28, dice);
    }

    @Test
    public void calcualteDiceValuesCarre() {
        Yams yams = new Yams();
        Integer dice = yams.calculateScore(Map.of(
                1, 4,
                2, 1));
        assertEquals(35, dice);
    }

    @Test
    public void calcualteDiceValuesFull() {
        Yams yams = new Yams();
        Integer dice = yams.calculateScore(Map.of(
                1, 3,
                2, 2));
        assertEquals(30, dice);
    }

    @Test
    public void calcualteDiceValuesYams() {
        Yams yams = new Yams();
        Integer dice = yams.calculateScore(Map.of(
                1, 5));
        assertEquals(50, dice);
    }

    @Test
    public void calcualteDiceValuesGrandeSuite() {
        Yams yams = new Yams();
        Integer dice = yams.calculateScore(Map.of(
                1, 1,
                2, 1,
                3, 1,
                4, 1,
                5, 1));
        assertEquals(40, dice);
    }
}




