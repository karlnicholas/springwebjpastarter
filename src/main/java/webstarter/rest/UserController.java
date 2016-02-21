package webstarter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import webstarter.domain.User;
import webstarter.service.UserService;

/**
 * Simple rest controller. Lists all the current users and 
 * allows creation of a new user.
 * 
 * @author karl
 *
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, params=("id"))
	public User findUser(@RequestParam Integer id) {
		return userService.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST, params={"name"})
	public User createUser(@RequestParam String name) {
		return userService.createUser(name);
	}
	
}
