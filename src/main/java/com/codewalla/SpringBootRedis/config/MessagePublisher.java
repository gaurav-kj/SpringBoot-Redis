package com.codewalla.SpringBootRedis.config;


public interface MessagePublisher {
    void publish(String message);
}
