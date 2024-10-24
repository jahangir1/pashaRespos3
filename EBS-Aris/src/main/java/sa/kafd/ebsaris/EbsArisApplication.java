package sa.kafd.ebsaris;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="EBS-Aris Integration"))
@EnableDiscoveryClient
public class EbsArisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbsArisApplication.class, args);
	}

}
