package edu.APIEstudos.controller;

import edu.APIEstudos.model.User;
import edu.APIEstudos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.getAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable("id") int id){
        return userRepository.getById(id);
    }

    @PostMapping("user/new")
    public void postUser(@RequestBody User user){
        userRepository.add(user);
    }
    @PutMapping("user/{id}/update")
    public void updateUser(@PathVariable("id") int id, @RequestBody User user){
        userRepository.update(id, user);
    }

    @DeleteMapping("user/{id}/delete")
    public void deleteUser(@PathVariable("id") int id){
        userRepository.delete(id);
    }
}
