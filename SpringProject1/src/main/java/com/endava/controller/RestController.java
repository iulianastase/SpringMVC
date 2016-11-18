package com.endava.controller;

import com.endava.model.Users;
import com.endava.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by inastase on 11/18/2016.
 */
@Controller
@RequestMapping("/users")
public class RestController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Users getUser(@PathVariable Integer id){
        return usersService.getUser(id);
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Users> getUsers(){
        return usersService.getUsers();
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Users saveUser(@RequestBody @Valid Users u){
        return usersService.saveUser(u);
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Integer id){
        usersService.deleteUsers(id);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public Users updateUser(@RequestParam Users u){
        return usersService.update(u);
    }

    @RequestMapping(value = "/createUsers", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void createUsers(){
       usersService.createUsers();
    }


}
