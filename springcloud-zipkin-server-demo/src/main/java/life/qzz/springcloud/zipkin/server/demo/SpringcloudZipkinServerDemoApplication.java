package life.qzz.springcloud.zipkin.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinStreamServer
@EnableZipkinServer
public class SpringcloudZipkinServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZipkinServerDemoApplication.class, args);
	}

	@Bean
	public MySQLStorage mySQLStorage(DataSource dataSource){
		return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
	}
}
