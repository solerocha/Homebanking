package com.homebanking.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.homebanking.models.User;
import com.homebanking.repositories.UserRepository;


@Service
public class UserService {
	
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User change(User user) {
        return userRepository.save(user);
    }

    public boolean remove(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<User> find(long id) {
        return userRepository.findById(id);
    }
    
    public Iterable<User> findAll(){
    	return userRepository.findAll();
    }
}