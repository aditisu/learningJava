package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FirstService {

    public Integer sum(int i, int j){
        final Integer response = i + j ;
        log.info("Sum is {}", response);
        return response;
    }

}
