package com.example.demo.Model;

import static com.example.demo.SecurityConfig.PermissionConfig.*;
import com.example.demo.SecurityConfig.PermissionConfig;
import com.google.common.collect.Sets;
import java.util.Set;

public enum Role {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));


    private final Set<PermissionConfig> permissions;

    Role(Set<PermissionConfig> permissions) {
        this.permissions = permissions;
    }

    public Set<PermissionConfig> getPermissions() {
        return permissions;
    }
}
