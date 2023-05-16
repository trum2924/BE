package com.sb.brothers.capstone.services;

import com.sb.brothers.capstone.entities.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAllUsers();
    void updateUser(User user);
    //void removeUserById(String id);
    Optional<User> getUserById(String id);
    Boolean isUserExist(String id);
    List<User> findManagerByStoreId(int storeId);
    Optional<User> getUserByEmailAndId(String email, String id);
    //void changePassword(String id, String newPass);
    List<User> getAllTheUsersByRoleId(int roleId);
    void updateProfile(String id, String address, String email, String firstName, String lastName, Date modifiedDate, String phone);
    Optional<String> getUserByPostId(int id);
    void updateBalance(String id,int balance);
}
