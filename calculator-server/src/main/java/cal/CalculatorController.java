package cal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    
    @RequestMapping("/cal/v1/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a+b;
    }
    
}
