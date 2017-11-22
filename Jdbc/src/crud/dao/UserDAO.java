package crud.dao;

import model.User;

import java.util.List;


public interface UserDAO {

	public void insert(User u);

	public void update(User u);

	public void delete(User u);

	public List<User> display();

	public User findOne(int id);

}
