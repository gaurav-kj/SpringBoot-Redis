package com.codewalla.SpringBootRedis.service;


import com.codewalla.SpringBootRedis.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}