package com.domain;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by Click Chain on 9/14/2016.
 */
public class User {

  private final UUID id;
  private final String name;
  private final String password;

  public User(UUID id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public List<SimpleGrantedAuthority> getAuthorities() {
    return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));
  }
}
