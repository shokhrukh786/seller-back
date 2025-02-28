package uz.shohruh.service;

import uz.shohruh.model.Role;
import uz.shohruh.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
    void changeRole(Role newRole, String username);
}
