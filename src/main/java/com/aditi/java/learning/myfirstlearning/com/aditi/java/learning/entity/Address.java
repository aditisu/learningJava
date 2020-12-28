package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String adress1;
    private String adress2;
    private String city;
    private String state;
    private String zip;

}
