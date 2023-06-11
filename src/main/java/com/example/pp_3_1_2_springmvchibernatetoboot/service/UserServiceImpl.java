package com.example.pp_3_1_2_springmvchibernatetoboot.service;

import com.example.pp_3_1_2_springmvchibernatetoboot.dao.UserDao;
import com.example.pp_3_1_2_springmvchibernatetoboot.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(User user) {
        dao.add(user);
    }

    @Override
    public User getUser(long id) {
        return dao.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        dao.deleteUserById(id);
    }

    @Override
    public List<User> listUsers() {
        return dao.listUsers();
    }


}


