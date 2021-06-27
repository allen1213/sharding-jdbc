package com.example.shardingjdbc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private Long id;

    private String userName;

    private String gender;

    private String userType;

}
