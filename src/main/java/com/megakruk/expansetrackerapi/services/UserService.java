package com.megakruk.expansetrackerapi.services;

import com.megakruk.expansetrackerapi.domain.User;
import com.megakruk.expansetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
