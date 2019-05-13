package biao.yu.sfcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SfCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfCloudEurekaApplication.class, args);

	}

}