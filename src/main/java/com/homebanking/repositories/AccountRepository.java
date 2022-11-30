package com.homebanking.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homebanking.models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
