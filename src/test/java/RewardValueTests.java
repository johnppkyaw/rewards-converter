import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000.50;
        int expectedMileValue = 285857;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMileValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int mileValue = 500;
        double expectedCashValue = 1.75;
        var rewardValue = new RewardValue(mileValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
