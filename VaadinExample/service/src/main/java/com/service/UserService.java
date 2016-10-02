package com.service;

import com.domain.User;

/**
 * Created by Click Chain on 9/14/2016.
 */
public interface UserService {
  User getUser();

  User loadUserByUsername(String username);
}
