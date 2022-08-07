package dio.bootcamp.santander.useless_facts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UselessFactsApplication {
	public static void main(String[] args) {
		SpringApplication.run(UselessFactsApplication.class, args);
	}
}
