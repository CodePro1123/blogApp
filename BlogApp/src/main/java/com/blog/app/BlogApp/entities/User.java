package com.blog.app.BlogApp.entities;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames = {"username"}),
@UniqueConstraint(columnNames = {"email"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="user_roles",
            joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"), //it is for User table (parent table)
    inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id")) //it is for role table (child table)
    private Set<Role> roles;




}
