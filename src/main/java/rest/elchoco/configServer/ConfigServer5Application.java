package rest.elchoco.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer5Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer5Application.class, args);
	}

}
