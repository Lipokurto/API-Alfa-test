package AK01.ResultMetods;

public class Result {
    private Boolean success;
    private Integer code;
    private String pid;
    private DataResult data;



    public Result() { }

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

    public DataResult getData() {
        return data;
    }

    public void setData(DataResult data) {
        this.data = data;
    }

    public Result(Boolean success, Integer code, String pid, DataResult data) {
        this.success = success;
        this.code = code;
        this.pid = pid;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", code=" + code +
                ", pid='" + pid + '\'' +
                ", data=" + data +
                '}';
    }
}
