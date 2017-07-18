package cn.saytime.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zh
 * @ClassName cn.saytime.cloud.UserApplication
 * @Description
 * @date 2017-07-18 21:03:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
