package stenden.spring.resource.Requests;

public class OptionsRequest {
    private String type;
    private int id;

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
