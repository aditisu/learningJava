package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

}
