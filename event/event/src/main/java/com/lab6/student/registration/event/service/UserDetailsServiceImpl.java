package com.lab6.student.registration.event.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lab6.student.registration.event.entity.StudentUser;
import com.lab6.student.registration.event.repository.UserRepository;
import com.lab6.student.registration.event.security.MyUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	   @Autowired
	    private UserRepository userRepository;
	     
	    @Override
	    public UserDetails loadUserByUsername(String username)
	            throws UsernameNotFoundException {
	        StudentUser user = userRepository.getUserByUsername(username);
	         
	        if (user == null) {
	            throw new UsernameNotFoundException("Could not find user");
	        }
	         
	        return new MyUserDetails(user);
	    }

}
