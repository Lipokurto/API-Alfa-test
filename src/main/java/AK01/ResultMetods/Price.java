package AK01.ResultMetods;

public class Price {
    private PriceRub rub;

    public Price() {}

    public PriceRub getRub() {
        return rub;
    }

    public void setRub(PriceRub rub) {
        this.rub = rub;
    }

    public Price(PriceRub rub) {
        this.rub = rub;
    }

    @Override
    public String toString() {
        return "Price{" +
                "rub=" + rub +
                '}';
    }
}
