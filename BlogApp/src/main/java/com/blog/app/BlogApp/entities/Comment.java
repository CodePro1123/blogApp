package com.blog.app.BlogApp.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ("post_id"),nullable = false)
    private Post post;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id) && Objects.equals(name, comment.name) && Objects.equals(email, comment.email) && Objects.equals(body, comment.body) && Objects.equals(post, comment.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, body, post);
    }

    /*

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="post_id",nullable = false)
private Post post;*/
}

//foriegn key mapped with primary key automatically
