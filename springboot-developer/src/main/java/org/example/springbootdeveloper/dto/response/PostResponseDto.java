package org.example.springbootdeveloper.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.springbootdeveloper.entity.Post;

import java.util.List;

@Data
@AllArgsConstructor
public class PostResponseDto {
    private String id;
    private String title;
    private String content;
    private String author;


    private List<CommentResponseDto> comments;

    public PostResponseDto(Post savedPost) {
    }

    public PostResponseDto() {

    }

    public PostResponseDto(Long id, String title, String content, String author, List<CommentResponseDto> commentDtos) {
    }

    public static String getWriter() {
        return null;
    }
}
