package AK01.ResultMetods;

public class DataValidSupplier {
    private Integer id;
    private String code;
    private String title;

    public DataValidSupplier() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DataValidSupplier(Integer id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    @Override
    public String toString() {
        return "DataValidSupplier{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
