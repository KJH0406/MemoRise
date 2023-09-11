package com.tjjhtjh.memorise.domain.user.repository;

import com.tjjhtjh.memorise.domain.user.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndProviderAndIsDeletedFalse(String email, String provider);
}
