package com.megakruk.expansetrackerapi.repositories;

import com.megakruk.expansetrackerapi.domain.User;
import com.megakruk.expansetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password)
            throws EtAuthException;

    User findByEmailAndPassword(String email, String password)
            throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}