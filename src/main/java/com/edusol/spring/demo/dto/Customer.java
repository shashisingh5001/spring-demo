package com.edusol.spring.demo.dto;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Customer implements Serializable {
    private int id;
    private String name;
    private String city;
}
