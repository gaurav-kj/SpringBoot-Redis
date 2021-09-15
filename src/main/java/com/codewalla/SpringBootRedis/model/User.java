package com.codewalla.SpringBootRedis.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("User")
public class User implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}