package com.edusol.spring.demo.service;

import com.edusol.spring.demo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class TestService {

    public List<Customer> getHelloWorld() {
        log.info("Inside Service");
     return Arrays.asList(
                new Customer(1, "atul", "Pune"),
                new Customer(2, "Pranay", "Pune"),
                new Customer(3, "Joheb", "Pune"),
                new Customer(4, "Sakhare", "Pune")

        );
    }
}
