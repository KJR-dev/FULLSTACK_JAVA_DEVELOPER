package com.examserver.service.impl;

import com.examserver.model.User;
import com.examserver.model.UserRole;
import com.examserver.repo.RoleRepository;
import com.examserver.repo.UserRepository;
import com.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User u=this.userRepository.findByUserName(user.getUserName()); //this
        if(u!=null){
            System.out.println("User is already there!!");
            throw new Exception("User already present!!");
        }else{
            for (UserRole ur:userRoles) {
                roleRepository.save(ur.getRole()); //this
            }
            user.getUserRole().addAll(userRoles);
            u=this.userRepository.save(user);
        }
        return u;
    }
}
