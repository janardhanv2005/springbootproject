package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.entity.UserAuthEntity;
import com.mycompany.springbootproject.repository.UserAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService implements UserDetailsService {

    @Autowired
    private UserAuthenticationRepository userAuthenticationRepository;

    public void save(UserAuthEntity user) {
        userAuthenticationRepository.save(user);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  userAuthenticationRepository.findByUsername(username);
    }
}
