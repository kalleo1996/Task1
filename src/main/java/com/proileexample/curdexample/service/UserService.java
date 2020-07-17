package com.proileexample.curdexample.service;

import com.proileexample.curdexample.entity.UserModel;
import com.proileexample.curdexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

   public UserModel saveUser(UserModel user){

       return repository.save(user);
   }



   public List<UserModel> saveUsers(List<UserModel> users){

        return repository.saveAll(users);
   }

   public List<UserModel> getUsers(){
      return repository.findAll();
   }

   public UserModel getUserById(int id){
        return repository.findById(id).orElse(null);
   }

   public UserModel getUserByNIC(String nic){
         return repository.findByNIC(nic);
   }



    public String deleteUser(int id){
        repository.deleteById(id);
        return "User removed" + id;
   }





    public UserModel updateUser(UserModel user){
        UserModel existinguser = repository.findById(user.getId()).orElse(null);
        existinguser.setLname(user.getLname());
        existinguser.setFname(user.getFname());
        existinguser.setDob(user.getDob());
        existinguser.setAddress(user.getAddress());
        existinguser.setPhone_number(user.getPhone_number());
        existinguser.setMid(user.getMid());
        existinguser.setNIC(user.getNIC());
        existinguser.setEmail(user.getEmail());
       return repository.save(existinguser);


    }
}
