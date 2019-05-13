package biao.yu.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
public class SpringCloudConfigClientApplication {

	private ContextRefresher contextRefresher;

	@Autowired
	public SpringCloudConfigClientApplication(ContextRefresher contextRefresher) {
		this.contextRefresher = contextRefresher;
	}




	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

	@Scheduled(fixedRate = 1000)
	public void update(){
		contextRefresher.refresh();
	}

}
