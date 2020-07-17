package com.proileexample.curdexample.controller;

import com.proileexample.curdexample.entity.UserModel;

import com.proileexample.curdexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path="profile")
public class UserController {
   @Autowired
   private UserService service;

   @PostMapping("/addUser")
   public UserModel addUser(@RequestBody UserModel newuser){
       return service.saveUser(newuser);
   }


    @PostMapping("/addUsers")
    public List<UserModel> addUsers(@RequestBody List<UserModel> users){
       return service.saveUsers(users);

   }

   @GetMapping("/users")
    public List<UserModel> findAllUsers(){
        return service.getUsers();
   }

    @GetMapping("/userbyid/{id}")
    public UserModel findUserById(@PathVariable int id){
       return service.getUserById(id);
    }

    @GetMapping("/user/{nic}")
    public UserModel findUserByNIC(@PathVariable String nic){
       return service.getUserByNIC(nic);
    }


    @PutMapping("/updateuser")
    public UserModel updateUser(@RequestBody UserModel oneuser){
      return service.updateUser(oneuser);

   }


    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
       System.out.println("user deleted");
       return service.deleteUser(id);

    }





}
