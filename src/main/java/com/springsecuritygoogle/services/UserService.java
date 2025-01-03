package com.springsecuritygoogle.services;

import com.springsecuritygoogle.dtos.UserDto;
import com.springsecuritygoogle.mappers.UserMapper;
import com.springsecuritygoogle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserMapper::toUserDto).toList();
    }

    public UserDto findById(Long id) {
        return UserMapper.toUserDto(userRepository.findById(id).orElse(null));
    }
}
