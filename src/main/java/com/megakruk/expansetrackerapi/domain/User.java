package com.megakruk.expansetrackerapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
