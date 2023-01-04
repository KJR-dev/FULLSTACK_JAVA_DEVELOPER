package com.examserver.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    @Id
    private long roleId;
    private String roleName;
    @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="role")
    private Set<UserRole> userRole=new HashSet<>();
    public Role() {
    }

    public Role(long roleId, String roleName, Set<UserRole> userRole) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.userRole = userRole;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }
}
