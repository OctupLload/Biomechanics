package com.biomechanics.domain.entities.security;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public enum Role implements GrantedAuthority {

    ADMIN("admin"),
    USER("user");

    private final String vale;

    @Override
    public String getAuthority() {
        return vale;
    }
}