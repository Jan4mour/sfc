package com.sfc.sistemaFinalizacaoContratual.service;

import com.sfc.sistemaFinalizacaoContratual.model.User;

import java.util.List;

public interface UserService{
    public List<User> retrieveUsers();

    public User getUser(Long id);

    public void saveUser(User user);

    public void deleteUser(Long id);

    public void updateUser(User user);

}
