package com.sfc.sistemaFinalizacaoContratual.controller;

import com.sfc.sistemaFinalizacaoContratual.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sfc.sistemaFinalizacaoContratual.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        List<User> users = userService.retrieveUsers();
        return users;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/add")
    public void addNewUser(User user) {
        userService.saveUser(user);
    }

    @PutMapping("update/{id}")
    public void updateUser(@RequestBody User newUser, @PathVariable(name = "id") Long id) {
        User user = userService.getUser(id);
        if (user!=null){
            userService.updateUser(newUser);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
    }
}
