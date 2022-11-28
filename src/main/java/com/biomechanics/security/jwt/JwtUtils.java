package com.biomechanics.security.jwt;

import io.jsonwebtoken.Claims;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JwtUtils {

    public static JwtAuthentication generate(Claims claims) {
        final JwtAuthentication jwtInfoToken = new JwtAuthentication();
        jwtInfoToken.setRoles(claims.get("role", String.class));
        jwtInfoToken.setFirstName(claims.get("sub", String.class));
        jwtInfoToken.setUsername(claims.getSubject());
        return jwtInfoToken;
    }

//    private static Set<Role> getRoles(Claims claims) {
//        final List roles = claims.get("role", List.class);
//        return roles.stream().collect(Collectors.toSet());
//    }
}
