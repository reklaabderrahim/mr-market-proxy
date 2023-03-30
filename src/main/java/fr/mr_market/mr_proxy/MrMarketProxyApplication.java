package fr.mr_market.mr_proxy;

import fr.mr_market.mr_proxy.configuration.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MrMarketProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrMarketProxyApplication.class, args);
	}

}
