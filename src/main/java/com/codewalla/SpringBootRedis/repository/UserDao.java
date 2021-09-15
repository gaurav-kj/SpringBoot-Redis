package com.codewalla.SpringBootRedis.repository;


import com.codewalla.SpringBootRedis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
