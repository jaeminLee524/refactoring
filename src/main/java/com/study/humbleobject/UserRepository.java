package com.study.humbleobject;

interface UserRepository {
    User findById(int userId);
    void save(User user);
}
