package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.User;
import pl.coderslab.charity.repository.UserRepository;
import pl.coderslab.charity.service.UserService;
@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserRepository> implements UserService {

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super(repository);
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
}
