package org.example.springbootdeveloper.dto.request;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignInRequestDto {
    @NotNull
    private String email;
    @NotNull
    private String password;
}