package org.example.springbootdeveloper.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootdeveloper.entity.Category;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetBookResponseDto {
    private Long id;
    private String title;
    private String writer;
    private int publicationYear;
    private Category category;
}