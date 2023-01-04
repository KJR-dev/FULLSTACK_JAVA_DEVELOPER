package com.examserver.controller;

import com.examserver.model.Role;
import com.examserver.model.User;
import com.examserver.model.UserRole;
import com.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Role role=new Role();
        role.setRoleId(45L);
        role.setRoleName("Admin");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        Set<UserRole> roles=new HashSet<>(); //why set
        roles.add(userRole);

        return this.userService.createUser(user,roles);
    }

}
