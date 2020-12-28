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

        User user = new User();
        user.setFirstName("Aditi");
        user.setLastName("Priya");
        user.setPhoneNumber("4204404201");

        Address address = new Address();
        address.setAdress1("4894 Bernal Ave");
        address.setAdress2("Aptl");
        address.setCity("Pleasanton");
        address.setState("CA");
        address.setZip("94566");
        user.setAddress(address);

        return user;
    }

}
