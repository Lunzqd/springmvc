package com.lunz.course.controller;

import com.lunz.course.entity.domain.User;
import com.lunz.course.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> all(){
        return userService.findByAll();
    }

    @PostMapping("/save")
    public Object save(@RequestBody User user){
        userService.insertSelective(user);
        return true;
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Long id){
        userService.deleteByPrimaryKey(id);
        return true;
    }
}
