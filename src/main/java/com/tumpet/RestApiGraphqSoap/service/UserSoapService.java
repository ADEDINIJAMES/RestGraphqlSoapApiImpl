package com.tumpet.RestApiGraphqSoap.service;

import com.tumpet.RestApiGraphqSoap.entity.User;
import com.tumpet.RestApiGraphqSoap.entity.Users;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserSoapService {
    @WebMethod
    String saveUser (User users);
@WebMethod
     User getUser (Long id );
@WebMethod
    List<User> getAllUsers ();


    List<User> deleteUser(Long id);
}
