package com.tumpet.RestApiGraphqSoap.repository;

import com.tumpet.RestApiGraphqSoap.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
