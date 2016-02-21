package springweb.service;

import org.springframework.data.repository.CrudRepository;

import springweb.domain.User;

interface UserRepository extends CrudRepository<User, Integer>{

	User findByName(String name);

}
