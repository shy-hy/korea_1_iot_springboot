package org.example.springbootdeveloper.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.springbootdeveloper.entity.User;

@Data
@AllArgsConstructor
public class UserLoginResponseDto {
    private String token;
    private User user;
}
