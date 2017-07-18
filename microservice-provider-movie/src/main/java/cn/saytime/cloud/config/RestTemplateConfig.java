package cn.saytime.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zh
 * @ClassName cn.saytime.cloud.config.RestTemplateConfig
 * @Description
 * @date 2017-07-18 22:56:14
 */
@Configuration
public class RestTemplateConfig {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
