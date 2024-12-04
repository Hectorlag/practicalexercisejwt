package com.example.practicalexercisejwt.service;

import com.example.practicalexercisejwt.model.UserSec;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<UserSec> findAll();

    Optional<UserSec> findById(Long id);

    UserSec save(UserSec userSec);

    void deleteById(Long id);

    UserSec update(UserSec userSec);
}
