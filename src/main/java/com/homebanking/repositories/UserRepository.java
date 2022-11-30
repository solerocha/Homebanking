package com.homebanking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homebanking.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
