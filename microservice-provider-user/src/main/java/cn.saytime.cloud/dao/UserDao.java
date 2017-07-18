package cn.saytime.cloud.dao;

import cn.saytime.cloud.bean.User;

import java.util.List;

/**
 * @author zh
 * @ClassName cn.saytime.dao.UserDao
 * @Description
 * @date 2017-07-04 22:48:45
 */
public interface UserDao {

	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);
}
