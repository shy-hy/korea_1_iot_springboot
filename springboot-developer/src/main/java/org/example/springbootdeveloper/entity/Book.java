package org.example.springbootdeveloper.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 50)
    private String writer;

    @Column(nullable = false)
    private int publicationYear; // 출판 연도

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

}
