package org.example.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.dto.request.PostBookRequestDto;
import org.example.springbootdeveloper.dto.response.PostBookResponseDto;
import org.example.springbootdeveloper.dto.response.GetBookResponseDto;
import org.example.springbootdeveloper.entity.Book;
import org.example.springbootdeveloper.entity.Category;
import org.example.springbootdeveloper.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    // 단건 책 조회
    public GetBookResponseDto getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("책을 찾을 수 없습니다: " + id));
        return convertToGetBookResponseDto(book);
    }

    // 전체 책 조회
    public List<GetBookResponseDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(this::convertToGetBookResponseDto)
                .collect(Collectors.toList());
    }

    // 책 생성
    public PostBookResponseDto createBook(PostBookRequestDto requestDto) {
        Book book = new Book(
                null, requestDto.getTitle(), requestDto.getWriter(),
                requestDto.getPublicationYear(), requestDto.getCategory()
        );

        Book savedBook = bookRepository.save(book);
        return convertToPostBookResponseDto(savedBook);
    }

    // Entity -> GetBookResponseDto 변환
    private GetBookResponseDto convertToGetBookResponseDto(Book book) {
        return new GetBookResponseDto(
                book.getId(), book.getTitle(), book.getWriter(),
                book.getPublicationYear(), book.getCategory()
        );
    }

    // Entity -> PostBookResponseDto 변환
    private PostBookResponseDto convertToPostBookResponseDto(Book book) {
        return new PostBookResponseDto(
                book.getId(), book.getTitle(), book.getWriter(),
                book.getPublicationYear(), book.getCategory()
        );
    }
}
