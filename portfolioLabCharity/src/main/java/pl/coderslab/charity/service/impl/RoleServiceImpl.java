package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Role;
import pl.coderslab.charity.repository.RoleRepository;
import pl.coderslab.charity.service.RoleService;
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, RoleRepository> implements RoleService {

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role findRoleByName(String name) {
        return super.repository.findRoleByName(name);
    }
}
