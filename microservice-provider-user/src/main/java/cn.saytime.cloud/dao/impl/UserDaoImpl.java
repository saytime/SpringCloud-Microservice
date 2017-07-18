package cn.saytime.cloud.dao.impl;

import cn.saytime.cloud.bean.User;
import cn.saytime.cloud.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author zh
 * @ClassName cn.saytime.dao.impl.UserDaoImpl
 * @Description
 * @date 2017-07-04 22:50:07
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getUserById(Integer id) {// order
		List<User> list = jdbcTemplate.query("select * from tb_user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<User> getUserList() {
		List<User> list = jdbcTemplate.query("select * from tb_user", new Object[]{}, new BeanPropertyRowMapper(User.class));
		if(list!=null && list.size()>0){
			return list;
		}else{
			return null;
		}
	}

	@Override
	public int add(User user) {
		return jdbcTemplate.update("insert into tb_user(username, age, ctm) values(?, ?, ?)",
				user.getUsername(),user.getAge(), new Date());

	}

	@Override
	public int update(Integer id, User user) {
		return jdbcTemplate.update("UPDATE tb_user SET username = ? , age = ? WHERE id=?",
				user.getUsername(),user.getAge(), id);
	}

	@Override
	public int delete(Integer id) {
		return jdbcTemplate.update("DELETE from tb_user where id = ? ",id);
	}

}
