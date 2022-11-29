package com.biomechanics.security.jwt;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    admin,
    user,
    manager,
    superadmin,
    guest,
    coach;

    @Override
    public String getAuthority() {
        return "ROLE_" + name();
    }
}