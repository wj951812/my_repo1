package com.code.web;

import com.code.domain.User;
import com.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class Contorl {
    @Autowired
    private UserService us;
@RequestMapping("/findAll")
    public @ResponseBody List<User> findAll(){
        List<User> users = us.findAll();
    System.out.println(users);
        return users;
    }
}
