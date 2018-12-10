package stenden.spring.responses;

import stenden.spring.resource.Models.Laptop;

public class LaptopResponse extends BaseResponse {
    private String status;
    private Integer code;
    private Laptop laptop;


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

    public Laptop getLaptop(){
        return laptop;
    }

    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
}
