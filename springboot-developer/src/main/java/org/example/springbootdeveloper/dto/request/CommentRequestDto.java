package org.example.springbootdeveloper.dto.request;

import lombok.Data;

@Data
public class CommentRequestDto {
    private Long postId;
    private String content;
    private String commenter;
}
