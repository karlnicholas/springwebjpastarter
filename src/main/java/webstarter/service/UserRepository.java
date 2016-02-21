package webstarter.service;

import org.springframework.data.repository.CrudRepository;

import webstarter.domain.User;

/**
 * Spring specific interface that creates a basic CRUD repository.
 * Extended by the user for custom functions.
 * 
 * @author karl
 *
 */
interface UserRepository extends CrudRepository<User, Integer>{

	User findByName(String name);

}
