package com.mycompany.springbootproject.repository;

import com.mycompany.springbootproject.entity.TaskEntity;
import com.mycompany.springbootproject.entity.UserAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthenticationRepository extends JpaRepository<UserAuthEntity, Long> {

    public UserAuthEntity findByUsername(String username);
}
