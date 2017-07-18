package cn.saytime.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zh
 * @ClassName cn.saytime.cloud.MovieController
 * @Description
 * @date 2017-07-18 22:52:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}
