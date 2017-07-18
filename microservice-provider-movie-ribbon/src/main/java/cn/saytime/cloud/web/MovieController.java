package cn.saytime.cloud.web;

import cn.saytime.cloud.bean.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zh
 * @ClassName cn.saytime.cloud.web.MovieController
 * @Description
 * @date 2017-07-18 22:55:12
 */
@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movie/{id}")
	public JsonResult findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/user/"+id, JsonResult.class);
	}
}
