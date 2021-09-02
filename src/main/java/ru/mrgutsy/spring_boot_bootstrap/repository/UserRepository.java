package ru.mrgutsy.spring_boot_bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mrgutsy.spring_boot_bootstrap.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    User getUserById(long id);

}
