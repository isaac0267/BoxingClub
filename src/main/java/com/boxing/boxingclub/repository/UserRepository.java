package com.boxing.boxingclub.repository;

import com.boxing.boxingclub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for manging user entities, in the database
 * Extends Repository, providing CRUD (Create,Read,Update,Delete) operations
 * and additional methods for querying and managing User entities.
 */

public interface UserRepository extends JpaRepository<User,Long> {
}
