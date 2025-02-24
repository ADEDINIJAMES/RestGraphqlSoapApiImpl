package com.tumpet.RestApiGraphqSoap.service;

import com.tumpet.RestApiGraphqSoap.entity.Users;
import com.tumpet.RestApiGraphqSoap.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public String saveUser (Users users){
         userRepository.save(users);
         return "User saved successfully";

    }

    public Users getUser (Long id ){
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found "));
    }

    public List<Users> getAllUsers (){
        return userRepository.findAll();
    }

    public List<Users> deleteUser (Long id){
         userRepository.delete(getUser(id));
         return getAllUsers();
    }

}
