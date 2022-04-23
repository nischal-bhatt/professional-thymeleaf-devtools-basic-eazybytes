package professional2.eazybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Professional2EazybytesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Professional2EazybytesApplication.class, args);
	}

}
