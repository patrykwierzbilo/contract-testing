package contract.testing.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping(value = "/string")
public class ConsumerController {
    private final static String PRODUCER_URL = "http://producer-server:8080/string/hash/";
    private final WebClient client;

    public ConsumerController() {
        this.client =  WebClient.create();
    }

    @GetMapping(path = "/compare/{string1}/{string2}")
    public boolean compare(@PathVariable String string1, @PathVariable String string2) {
        String string1Hash = client.get()
                .uri(PRODUCER_URL+string1)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        if (string1Hash == null) {
            return false;
        }
        String string2Hash = client.get()
                .uri(PRODUCER_URL+string2)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return string1Hash.equals(string2Hash);
    }
}
