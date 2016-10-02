package com.auth;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * Created by Abdus Salam on 9/14/2016.
 */
@Component
public class AuthManager implements AuthenticationManager {

  @Autowired
  private UserService userService;

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
      String username = (String) authentication.getPrincipal();
      String password = (String) authentication.getCredentials();
      User user = userService.loadUserByUsername(username);
      if (user != null && user.getPassword().equals(password)) {;
       // return new UsernamePasswordAuthenticationToken(username, password, user.getAuthorities());
      }
      throw new BadCredentialsException("Bad Credentials");
  }
}
