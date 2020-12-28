package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

}
