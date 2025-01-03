package com.springsecuritygoogle.dtos;

import lombok.Builder;

@Builder
public record UserDto (Long id, String name, Long age, String cpf, String email) {}
