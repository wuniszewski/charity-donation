package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.entity.Role;
import pl.coderslab.charity.service.impl.RoleServiceImpl;

@Controller
public class RoleController {
    private RoleServiceImpl roleService;

    @Autowired
    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }
    @GetMapping("/createUserRole")
    public void createUserRole () {
        Role userRole = new Role();
        userRole.setName("ROLE_USER");
        roleService.save(userRole);
    }

}
