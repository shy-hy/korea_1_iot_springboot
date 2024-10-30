package org.example.springbootdeveloper.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetBookListResponseDto {
    private List<GetBookResponseDto> books; // 책 리스트
}