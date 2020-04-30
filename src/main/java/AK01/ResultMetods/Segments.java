package AK01.ResultMetods;

public class Segments {
    private DataOperSupplier operating_supplier;
    private DataValidSupplier validating_supplier;


    public Segments() {
    }

    public DataOperSupplier getOperating_supplier() {
        return operating_supplier;
    }

    public void setOperating_supplier(DataOperSupplier operating_supplier) {
        this.operating_supplier = operating_supplier;
    }

    public DataValidSupplier getValidating_supplier() {
        return validating_supplier;
    }

    public void setValidating_supplier(DataValidSupplier validating_supplier) {
        this.validating_supplier = validating_supplier;
    }

    public Segments(DataOperSupplier operating_supplier, DataValidSupplier validating_supplier) {
        this.operating_supplier = operating_supplier;
        this.validating_supplier = validating_supplier;
    }

    @Override
    public String toString() {
        return "Segments{" +
                "operating_supplier=" + operating_supplier +
                ", validating_supplier=" + validating_supplier +
                '}';
    }
}
