package com.tumpet.RestApiGraphqSoap.service;

import com.tumpet.RestApiGraphqSoap.entity.User;
import com.tumpet.RestApiGraphqSoap.entity.Users;
import com.tumpet.RestApiGraphqSoap.repository.UserRepository;
import com.tumpet.RestApiGraphqSoap.repository.UserRepositorySoap;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;

@Service
@WebService(endpointInterface = "com.tumpet.RestApiGraphqSoap.service.UserSoapService")
 public class UserSoapServiceImpl implements UserSoapService {

    private final UserRepositorySoap userRepository;

    public UserSoapServiceImpl(UserRepositorySoap userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String saveUser(User users) {
         userRepository.save(users);
         return "Users saved successfully";
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> deleteUser(Long id) {
         User users= getUser(id);
         userRepository.delete(users);
         return userRepository.findAll();
    }
}