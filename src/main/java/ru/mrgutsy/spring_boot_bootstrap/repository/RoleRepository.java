package ru.mrgutsy.spring_boot_bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mrgutsy.spring_boot_bootstrap.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String role);

}
