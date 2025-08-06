package com.JwtImplementation.jwt.service;

import com.JwtImplementation.jwt.entity.Student;
import com.JwtImplementation.jwt.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements UserDetailsService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = studentRepo.findByUsername(username);

        if (student == null){
            System.out.println("usern not found ");
            throw  new UsernameNotFoundException("user not found");
        }
    }
}
