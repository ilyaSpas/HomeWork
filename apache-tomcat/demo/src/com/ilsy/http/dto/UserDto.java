package com.ilsy.http.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDto {
    Long id;
    String mail;
}
