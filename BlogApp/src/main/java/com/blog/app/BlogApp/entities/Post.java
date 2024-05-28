package com.blog.app.BlogApp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name="post",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})} //unique=true and uniqueConstraint both are same.this another way to make unique colmn.
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name="title",nullable = false)
    private String title;
    @Column(name="description",nullable = false)
    private String description;
    @Column(name="content",nullable = false)
    private String content;


    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();



   /* @OneToMany(mappedBy = "post",cascade = CascadeType.All,fetch = FetchType.LAZY,orphanRemoval = true)
   private Set<Comment> comments = new HashSet<>();*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(title, post.title) && Objects.equals(description, post.description) && Objects.equals(content, post.content) && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, content, comments);
    }
}
