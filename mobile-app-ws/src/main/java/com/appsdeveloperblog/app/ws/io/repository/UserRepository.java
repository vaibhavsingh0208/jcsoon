package com.appsdeveloperblog.app.ws.io.repository;

import org.springframework.stereotype.Repository;
import com.appsdeveloperblog.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
}
