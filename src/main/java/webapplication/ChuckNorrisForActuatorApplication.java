package webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import services.ChuckNorrisJokeServiceImpl;

@SpringBootApplication
public class ChuckNorrisForActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisForActuatorApplication.class, args);
	}

}
