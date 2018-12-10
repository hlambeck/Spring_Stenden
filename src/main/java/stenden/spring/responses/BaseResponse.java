package stenden.spring.responses;

public class BaseResponse {
    private String status;
    private Integer code;
    private Object value;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue(){
        return value;
    }
}
