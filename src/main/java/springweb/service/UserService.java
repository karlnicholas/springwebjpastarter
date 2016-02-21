package springweb.service;

import springweb.domain.User;

public interface UserService {

	public User createUser(String name);

	public Iterable<User> findAll();

	public User findById(Integer id);

}
