package com.appsdeveloperblog.app.ws.io.repositories;

// import java.awt.print.Pageable;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloperblog.app.ws.io.entity.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
// public interface UserRepository extends CrudRepository<UserEntity, Long> {
	//UserEntity findAll(Pageable pageableRequest);
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
	// UserEntity findByLastName(String lastName);
}
