package com.endava.service;

import com.endava.model.Users;

import java.util.List;

/**
 * Created by inastase on 11/18/2016.
 */
public interface UsersServiceMethods {
    void createUsers();
    List<Users> getUsers();
    Users saveUser(Users u);
    void deleteUsers (Integer id);
    Users update (Users u);
    Users getUser(Integer id);
}
