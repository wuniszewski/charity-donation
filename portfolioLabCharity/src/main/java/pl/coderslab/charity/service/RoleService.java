package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Role;

public interface RoleService extends GenericService<Role> {
    Role findRoleByName(String name);
}
