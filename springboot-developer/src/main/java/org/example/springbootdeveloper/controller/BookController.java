package org.example.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.dto.request.PostBookRequestDto;
import org.example.springbootdeveloper.dto.response.PostBookResponseDto;
import org.example.springbootdeveloper.dto.response.GetBookResponseDto;
import org.example.springbootdeveloper.dto.response.GetBookListResponseDto;
import org.example.springbootdeveloper.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    // 단건 책 조회
    @GetMapping("/{id}")
    public ResponseEntity<GetBookResponseDto> getBookById(@PathVariable Long id) {
        GetBookResponseDto book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    // 전체 책 조회
    @GetMapping
    public ResponseEntity<GetBookListResponseDto> getAllBooks() {
        List<GetBookResponseDto> books = bookService.getAllBooks();
        GetBookListResponseDto response = new GetBookListResponseDto(books);
        return ResponseEntity.ok(response);
    }

    // 책 생성
    @PostMapping
    public ResponseEntity<PostBookResponseDto> createBook(@RequestBody PostBookRequestDto requestDto) {
        PostBookResponseDto createdBook = bookService.createBook(requestDto);
        return ResponseEntity.ok(createdBook);
    }
}
