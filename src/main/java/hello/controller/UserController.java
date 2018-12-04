package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.entity.User;
import hello.repository.UserRepository;

@RestController
public class UserController
{

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public Iterable<User> getUsers()
    {
        return userRepository.findAll();
    }

}
