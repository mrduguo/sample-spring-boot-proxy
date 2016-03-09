package gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class CalculatorGatewayController {


    @Value("${cal.service.base:http://localhost:8801/cal/v1/add?a={a}&b={b}}")
    private String addServiceUrlTemplate;

    private RestTemplate template = new RestTemplate();
    
    @RequestMapping("/cal/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        ResponseEntity<Integer> response =template.getForEntity(addServiceUrlTemplate,Integer.class,a,b);
        assert response.getStatusCode().is2xxSuccessful();
        return response.getBody();
    }
    
}
