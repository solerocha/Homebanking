package com.homebanking.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homebanking.models.Account;
import com.homebanking.models.User;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    /*
     * Optional<Account> findById(Long id);
     * 
     * List<Account> findByClient(User user);
     */

}
