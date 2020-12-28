package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.services;


import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.dao.UserDAO;
import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;

@Service
@Slf4j
public class UserService {

    @Autowired private UserDAO userDAO;

    public User getUserDetails(Long userId) {

        log.info("UserService >> getUserDetails : getting user details for th user Id: {}", userId);

        return userDAO.getUSerDetails(userId);

    }
}
