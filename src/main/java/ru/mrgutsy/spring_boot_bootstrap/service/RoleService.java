package ru.mrgutsy.spring_boot_bootstrap.service;



import ru.mrgutsy.spring_boot_bootstrap.model.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
