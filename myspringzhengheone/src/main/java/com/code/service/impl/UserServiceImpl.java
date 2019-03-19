package com.code.service.impl;

import com.code.dao.UserDao;
import com.code.domain.User;
import com.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao dao;
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
