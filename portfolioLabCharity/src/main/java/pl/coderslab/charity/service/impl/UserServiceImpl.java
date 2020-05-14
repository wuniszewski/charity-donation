package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Role;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.repository.RoleRepository;
import pl.coderslab.charity.repository.UserRepository;
import pl.coderslab.charity.service.UserService;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserRepository> implements UserService {
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserRepository repository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        super(repository);
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
//    public boolean checkIfCorrectUser(User loggedInUser) {
//        if (super.repository.findUserByEmail(loggedInUser.getEmail()) == null) {
//            return false;
//        }
//
//        return true;
//    }
    @Override
    public User findUserByEmail(String email) {
        return super.repository.findUserByEmail(email);
    }
    public void saveUser (User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        Role userRole = roleRepository.findRoleByName("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        super.repository.save(user);
    }
}
