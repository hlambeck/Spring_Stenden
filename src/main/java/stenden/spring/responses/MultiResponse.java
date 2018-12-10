package stenden.spring.responses;

import java.util.List;

public class MultiResponse  {
    private String status;
    private Integer code;
    private List<Object> values;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List values){
        this.values = values;
    }
}
