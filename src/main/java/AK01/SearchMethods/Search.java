package AK01.SearchMethods;

import AK01.SearchMethods.Data;

public class Search {
    private Boolean success;
    private Integer code;
    private String pid;
    private Data data;


    public Search() {}

    public Boolean getSuccess() {

        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Search(Boolean success, Integer code, String pid, Data data) {
        this.success = success;
        this.code = code;
        this.pid = pid;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Search{" +
                "success=" + success +
                ", code=" + code +
                ", pid='" + pid + '\'' +
                ", sro=" + data +
                '}';
    }
}
