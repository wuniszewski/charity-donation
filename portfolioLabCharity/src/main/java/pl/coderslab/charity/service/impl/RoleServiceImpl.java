package pl.coderslab.charity.service.impl;

import pl.coderslab.charity.entity.Role;
import pl.coderslab.charity.repository.RoleRepository;
import pl.coderslab.charity.service.RoleService;

public class RoleServiceImpl extends GenericServiceImpl<Role, RoleRepository> implements RoleService {

    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role findRoleByName(String name) {
        return super.repository.findRoleByName(name);
    }
}
