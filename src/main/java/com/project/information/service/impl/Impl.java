package com.project.information.service.impl;

import com.project.information.entity.User;

import java.util.Optional;

public interface Impl {
    Optional<User> getPersonAge(Long id);
}
