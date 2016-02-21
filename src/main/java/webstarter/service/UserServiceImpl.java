package webstarter.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import webstarter.domain.User;

/**
 * Implementation of the UserService interface that gets
 * Autowired into spring managed classes, e.g., WelcomeController & UserController.
 * 
 *  Business logic service layer.
 * 
 * @author karl
 *
 */
@Transactional
@Component(value = "userService")
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User createUser(String name) {
		User u = new User();
		u.setName(name);
		userRepository.save(u);
		return u;
	}
	
	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Integer id) {
		return userRepository.findOne(id);
	}

}
