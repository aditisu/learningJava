package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.dao;

import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity.Address;
import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserDAO {

    /**
     * This method is userd to pull user details based on the userId provided
     * @param userId
     * @return
     */
    public User getUSerDetails(Long userId){

        //TODO: To be implemented - realtime database integration

        return User.builder()
                .firstName("Aditi")
                .lastName("Priya")
                .phoneNumber("1231231231")
                .address(Address.builder()
                        .adress1("4894 Bernal Ave")
                        .adress2("Apt L")
                        .city("Pleasanton")
                        .state("CA")
                        .zip("94566")
                        .build())
                .build();

    }

}
