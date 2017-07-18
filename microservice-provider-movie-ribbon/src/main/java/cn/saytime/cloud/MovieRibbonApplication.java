package cn.saytime.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zh
 * @ClassName cn.saytime.cloud.web.MovieRibbonApplication
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRibbonApplication.class, args);
	}

}
