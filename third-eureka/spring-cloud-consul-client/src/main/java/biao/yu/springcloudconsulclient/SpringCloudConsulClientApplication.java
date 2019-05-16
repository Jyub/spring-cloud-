package biao.yu.springcloudconsulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulClientApplication.class, args);
	}

}
