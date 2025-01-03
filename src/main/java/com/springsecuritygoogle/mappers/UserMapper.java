package com.springsecuritygoogle.mappers;

import com.springsecuritygoogle.dtos.UserDto;
import com.springsecuritygoogle.entities.User;

public class UserMapper {

    public static User toUser(final UserDto userDto) {
        if (userDto == null) {
            return null;
        }

        return User.builder()
                .cpf(userDto.cpf())
                .name(userDto.name())
                .age(userDto.age())
                .email(userDto.email())
                .build();
    }

    public static UserDto toUserDto(final User user) {
        if (user == null) {
            return null;
        }

        return UserDto.builder()
                .cpf(user.getCpf())
                .name(user.getName())
                .age(user.getAge())
                .email(user.getEmail())
                .build();
    }
}
