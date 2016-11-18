package com.endava.service;

import com.endava.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by inastase on 11/18/2016.
 */
@Service
public class UsersService implements UsersServiceMethods{
    public static List<Users> usersList = new ArrayList<Users>();

    public void createUsers() {
        usersList.add(new Users(1,"Test","Tester",26));
        usersList.add(new Users(2,"Developer","Developer",22));
        usersList.add(new Users(3,"Teemo","Wizard",123));
        usersList.add(new Users(4,"Annie","Witch",125));

    }

    public List<Users> getUsers() {
        return usersList;
    }

    public Users saveUser(Users u) {
            u.setId(u.getId() + 1);
            this.usersList.add(u);
            return u;
    }

    public void deleteUsers(Integer id) {
        for(int i = 0; i < usersList.size(); i++){
            if(usersList.get(i).getId() == id){
                usersList.remove(i);
            }
        }
    }

    public Users update(Users u) {
        ListIterator<Users> usersIt = usersList.listIterator();
        Users user;
        while (usersIt.hasNext()){
            user = usersIt.next();
            if(user.getId() == u.getId()){
                usersIt.set(u);
                return u;
            }
        }
        return null;
    }

    public Users getUser(Integer id) {
        for(int i = 0; i < usersList.size(); i++){
            if(usersList.get(i).getId() == id){
                return usersList.get(i);
            }
        }
        return null;
    }

}
