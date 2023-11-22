package com.boxing.boxingclub.service;

import jakarta.persistence.Id;

import java.util.Optional;
import java.util.Set;

public interface IUserService<T, ID> {
    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deletBYId(ID id);

    Optional<T> findById(Id id);


}
