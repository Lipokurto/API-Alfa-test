package AK01.ResultMetods;

public class DataOperSupplier {
    private Integer id;
    private String code;
    private String title;

    public DataOperSupplier() {}

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

    public DataOperSupplier(Integer id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    @Override
    public String toString() {
        return "DataOperSupplier{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
