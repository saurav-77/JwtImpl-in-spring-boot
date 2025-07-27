package me.saurav.learnjwt.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.saurav.learnjwt.modal.User;

public interface UserRepo extends MongoRepository<User, String> {
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    Optional<User> findByName(String name);

}
