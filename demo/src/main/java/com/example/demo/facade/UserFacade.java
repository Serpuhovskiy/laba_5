package com.example.demo.facade;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

import lombok.Data;

@Component
@Data
public class UserFacade {
    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setFirstname(user.getName());
        userDTO.setLastname(user.getLastname());
        userDTO.setBio(user.getBio());
        userDTO.setPassword(user.getPassword());
        userDTO.setUsername(user.getUsername());
        userDTO.setId(user.getId());

        return userDTO;
    }
}
