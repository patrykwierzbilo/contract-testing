package contract.testing.producer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/string")
public class ProducerController {
    @GetMapping(path = "/hash/{string}")
    public int getHash(@PathVariable String string) {
        return string.hashCode();
    }


}
