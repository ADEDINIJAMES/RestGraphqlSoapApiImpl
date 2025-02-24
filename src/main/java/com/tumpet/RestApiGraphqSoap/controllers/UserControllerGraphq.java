package com.tumpet.RestApiGraphqSoap.controllers;

import com.tumpet.RestApiGraphqSoap.entity.Users;
import com.tumpet.RestApiGraphqSoap.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserControllerGraphq {
    private final UserService service;

@MutationMapping
    public String createUser (@Argument("input") Users users){
        return service.saveUser(users);

    }
@QueryMapping
    public Users userById (@Argument Long id){
        return service.getUser(id);
    }

@QueryMapping
    public List<Users> allUsers(){
        return service.getAllUsers();
    }
    @MutationMapping
    public List<Users> deleteUser(@Argument Long id ){
        return service.deleteUser(id);
    }

}
