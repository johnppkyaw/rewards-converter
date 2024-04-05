public class RewardValue {
    private final double MILES_TO_CASH_RATE = 0.0035;
    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash += cash;
    }
    public RewardValue(int miles) {
        this.miles += miles;
    }

    public double getCashValue() {
        return this.cash + (this.miles * MILES_TO_CASH_RATE);
    }

    public int getMilesValue() {
        return this.miles + (int)(this.cash / MILES_TO_CASH_RATE);
    }
}
