package com.repository;

import com.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Abdus Salam on 10/11/2016.
 */
public interface UserRepositoryImpl extends CrudRepository<User, UUID> {
}
