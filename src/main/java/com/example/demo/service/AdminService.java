package com.example.demo.service;

import com.example.demo.bo.UserProfileResponse;
import com.example.demo.bo.UserResponse;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long id);
    UserResponse deleteUserById(Long id);

}
