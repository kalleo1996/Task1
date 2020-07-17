package com.proileexample.curdexample.repository;

import com.proileexample.curdexample.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserModel,Integer> {

    UserModel findByNIC(String NIC);





}
