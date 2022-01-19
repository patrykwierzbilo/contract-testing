package contract.testing.consumer;

import contract.testing.consumer.controller.ConsumerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@PostConstruct
	private void postConstruct() {
		System.out.println("xewwed");
	}

}
