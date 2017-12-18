package life.qzz.springcloud.service.turbine.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
public class SpringcloudServiceTurbineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServiceTurbineDemoApplication.class, args);
	}
}
