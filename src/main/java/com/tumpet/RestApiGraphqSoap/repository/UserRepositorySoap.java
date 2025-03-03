package com.tumpet.RestApiGraphqSoap.repository;

import com.tumpet.RestApiGraphqSoap.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorySoap extends JpaRepository<User, Long> {
}
