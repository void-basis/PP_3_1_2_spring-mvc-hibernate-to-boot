package com.example.pp_3_1_2_springmvchibernatetoboot.dao;


import com.example.pp_3_1_2_springmvchibernatetoboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User getUser(long id);

    void deleteUserById(long id);

    List<User> listUsers();

    void updateUser(User user);
}