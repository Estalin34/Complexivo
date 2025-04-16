package com.example.spring_boot.service;




import com.example.spring_boot.models.User;
import com.example.spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findByName(name)
        .orElseThrow(()->new UsernameNotFoundException("User no Encontrado"));

        return new org.springframework.security.core.userdetails.User(
                user.getName(),
                user.getPassword(),
                List.of()
        );
    }
}
