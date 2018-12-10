package stenden.spring.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse extends BaseResponse{

    private String error;

}
