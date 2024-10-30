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
public class BookRequestUpdateDto {
    private String title;           // 도서 제목
    private String writer;          // 저자 (author -> writer로 변경)
    private int publicationYear;    // 출판 연도 추가
    private Category category;      // 카테고리
}
