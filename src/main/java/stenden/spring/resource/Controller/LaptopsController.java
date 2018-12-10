package stenden.spring.resource.Controller;

import org.springframework.web.bind.annotation.*;
import stenden.spring.resource.Requests.LaptopRequest;
import stenden.spring.responses.BaseResponse;
import stenden.spring.responses.LaptopResponse;
import stenden.spring.responses.MultiResponse;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/laptops")
public class LaptopsController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MultiResponse getAll(@RequestParam(value = "id") Number id, @RequestBody LaptopRequest request) {
        //get all laptops
        MultiResponse temp = new MultiResponse();
        temp.setCode(500);
        temp.setStatus("Some error maybe");
        List<LaptopResponse> list = new ArrayList<>();
        list.add(new LaptopResponse());
        temp.setValues(list);

        return temp;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LaptopResponse getSpecific(@PathVariable Long id) {
        //get laptop using ID
        return new LaptopResponse();
    }
}
