package com.cg.contactApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.contactApplication.model.User;

public interface RegistrationRepository extends CrudRepository<User, Long> {

	public User findByEmailId(String EmailId);
	public User findByEmailIdAndPassword(String EmailId, String Password);
}
