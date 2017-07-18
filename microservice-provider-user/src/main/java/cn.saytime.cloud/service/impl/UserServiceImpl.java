package cn.saytime.cloud.service.impl;

import cn.saytime.cloud.bean.User;
import cn.saytime.cloud.dao.UserDao;
import cn.saytime.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zh
 * @ClassName cn.saytime.service.impl.UserServiceImpl
 * @Description
 * @date 2017-07-04 22:49:27
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int update(Integer id, User user) {
		return userDao.update(id, user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}
}
