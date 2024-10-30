package org.example.springbootdeveloper.repository;

import jakarta.persistence.metamodel.SingularAttribute;
import org.example.springbootdeveloper.entity.Post;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // 반환 타입 메서드명 (매개변수...);
    // : 구현부가 없는 메서드

    // 작성자를 사용하여 게시글 조회 - 필터링
    List<Post> findByTitle(String author);

    Optional<Object> findById(SingularAttribute<AbstractPersistable, Serializable> id);

    void deleteById(SingularAttribute<AbstractPersistable, Serializable> id);
}
