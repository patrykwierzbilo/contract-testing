package contract.testing.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
