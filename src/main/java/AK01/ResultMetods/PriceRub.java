package AK01.ResultMetods;

public class PriceRub {
    private String fare;
    private String fee;
    private String taxes;
    private String amount;

    public PriceRub() {}

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PriceRub(String fare, String fee, String taxes, String amount) {
        this.fare = fare;
        this.fee = fee;
        this.taxes = taxes;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PriceRub{" +
                "fare='" + fare + '\'' +
                ", fee='" + fee + '\'' +
                ", taxes='" + taxes + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
