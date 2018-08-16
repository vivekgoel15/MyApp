package com.abc.account.service;

import com.abc.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
