package contract.testing.consumer;


import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerExtension;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;

@SpringBootTest
public class ConsumerControllerTest {

    @RegisterExtension
    public StubRunnerExtension stubRunner = new StubRunnerExtension()
            .downloadStub("contract.testing", "producer---stubs",
                    "0.0.1-SNAPSHOT", "stubs")
            .withPort(8080)
            .stubsMode(StubRunnerProperties.StubsMode.LOCAL);

    @Test
    public void get_hash_for_string_contract() {
        // given:
        RestTemplate restTemplate = new RestTemplate();
        // when:
        ResponseEntity<String> result = restTemplate
                .getForEntity("http://localhost:8080/string/hash/getHashOfMe", String.class);
        // then:
        BDDAssertions.then(result.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(result.getBody()).isEqualTo("-2069022349");
    }
}