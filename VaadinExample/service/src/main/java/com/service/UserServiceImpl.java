package com.service;

import com.domain.User;

import java.util.UUID;

/**
 * Created by Abdus Salam on 9/14/2016.
 */
public class UserServiceImpl implements UserService {
  @Override
  public User getUser() {
    return new User(UUID.randomUUID(), "Ali", "dev");
  }

  @Override
  public User loadUserByUsername(String username) {
    return username == "Ali" ? new User(UUID.randomUUID(), "Ali", "dev") : null;
  }
}
