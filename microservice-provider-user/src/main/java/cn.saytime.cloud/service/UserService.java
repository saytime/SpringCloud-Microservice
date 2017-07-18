package cn.saytime.cloud.service;

import cn.saytime.cloud.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zh
 * @ClassName cn.saytime.service.UserService
 * @Description
 * @date 2017-07-04 22:49:05
 */
public interface UserService {

	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);
}
