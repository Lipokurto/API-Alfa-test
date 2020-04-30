package AK01.SearchMethods;

public class Data {
    private String sro;

    public Data() {}

    public String getSro() {
        return sro;
    }

    public void setSro(String sro) {
        this.sro = sro;
    }

    public Data(String sro) {
        this.sro = sro;
    }

    @Override
    public String toString() {
        return sro;
    }
}
