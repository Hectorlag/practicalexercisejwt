package com.example.practicalexercisejwt.service;

import com.example.practicalexercisejwt.model.Permission;
import com.example.practicalexercisejwt.model.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {

    List<Role> findAll();

    Optional<Role> findById(Long id);

    Role save(Role role);

    void deleteById(Long id);

    Role update(Role role);

}
