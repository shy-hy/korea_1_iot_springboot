package org.example.springbootdeveloper.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.springbootdeveloper.entity.Category;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostBookRequestDto {
    private String title;
    private String writer;
    private int publicationYear; // 출판 연도
    private Category category;
}