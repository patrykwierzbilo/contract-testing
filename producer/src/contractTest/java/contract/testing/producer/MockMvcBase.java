package contract.testing.producer;

import contract.testing.producer.controller.ProducerController;
import org.junit.jupiter.api.BeforeEach;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest(classes = ProducerApplication.class)
public abstract class MockMvcBase {

    @MockBean
    ProducerController producerController;

    @BeforeEach public void setup() {
        RestAssuredMockMvc.standaloneSetup(producerController);

        Mockito.when(producerController.getHash("getHashOfMe"))
                .thenReturn(-2069022349);
    }

}