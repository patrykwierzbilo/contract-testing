package contract.testing.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
