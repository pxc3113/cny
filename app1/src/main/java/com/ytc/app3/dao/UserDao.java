package com.ytc.app3.dao;

import java.util.List;
import java.util.Optional;

import com.ytc.app3.model.*;

public interface UserDao {
    public List<User> get(int page, int size);
    public Optional<User> getByName(String name);
    public void register(User user);
}