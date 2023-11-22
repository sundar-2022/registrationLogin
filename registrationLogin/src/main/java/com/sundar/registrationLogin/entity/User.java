package com.sundar.registrationLogin.entity;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class User {

    @Id
//    @GeneratedValue(GeneratedValue=)
    private int userId;
    private String name;
    private String userName;
    private String password;

    @ElementCollection(targetClass = String.class)
    private List<String> technology;
}
