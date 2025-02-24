package com.tumpet.RestApiGraphqSoap.controllers;

import com.tumpet.RestApiGraphqSoap.entity.Users;
import com.tumpet.RestApiGraphqSoap.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserControllerRest {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser (@RequestBody Users users){
        String response= userService.saveUser(users);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser (@PathVariable (name = "id") Long id){
        Users response= userService.getUser(id);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers (){
        List<Users> response= userService.getAllUsers();
        return ResponseEntity.status(200).body(response);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteUser (@PathVariable Long id){
        List<Users> response= userService.deleteUser(id);
        return ResponseEntity.status(200).body(response);
    }

}
