package life.qzz.springcloud.zuul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringcloudZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulDemoApplication.class, args);
	}
}
