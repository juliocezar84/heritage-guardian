package com.mackenzie.heritageguardian.services;

import com.mackenzie.heritageguardian.dtos.UserDTO;
import com.mackenzie.heritageguardian.entities.User;
import com.mackenzie.heritageguardian.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> findAll(Pageable pageable){
        Page<User> result = userRepository.findAll(pageable);
        return result.map(user -> new UserDTO(user));
    }
}
