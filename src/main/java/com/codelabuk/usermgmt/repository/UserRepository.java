package com.codelabuk.usermgmt.repository;

import com.codelabuk.usermgmt.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class UserRepository {

    List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(String id) {
        Optional<User> optionalUser = userList.stream().filter(user -> user.getId().equalsIgnoreCase("id"))
                .findFirst();
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User updateUser(User user) {
        for(User user1 : userList){
            if(user.getId().equalsIgnoreCase(user1.getId())){
                user1.setName(user.getName());
                user1.setAddress(user.getAddress());
                return  user1;
            }
        }
        return new User();
    }

    public User deleteUser(String id) {
        Optional<User> optionalUser = userList.stream().filter(user -> user.getId().equalsIgnoreCase("id"))
                .findFirst();
        if (optionalUser.isPresent()){
            User user = optionalUser.get();
            userList.remove(user);
            return  user;
        } else {
            return new User();
        }
    }
}
