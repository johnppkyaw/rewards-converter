public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash += cash;
    }
    public RewardValue(int miles) {
        this.miles += miles;
    }

    public double getCashValue() {
        return this.cash + (this.miles * 0.0035);
    }

    public int getMilesValue() {
        return this.miles + (int)(this.cash / 0.0035);
    }
}
