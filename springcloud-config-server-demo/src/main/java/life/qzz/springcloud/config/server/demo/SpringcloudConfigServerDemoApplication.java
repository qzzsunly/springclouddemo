package life.qzz.springcloud.config.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerDemoApplication.class, args);
	}
}
