package com.sfc.sistemaFinalizacaoContratual.service.impl;


import com.sfc.sistemaFinalizacaoContratual.model.User;
import com.sfc.sistemaFinalizacaoContratual.repository.UserRepository;
import com.sfc.sistemaFinalizacaoContratual.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> retrieveUsers(){
        return  userRepository.findAll();
    }

    public User getUser(Long id){
        Optional<User> optUser = userRepository.findById(id);
        return optUser.get();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

}
