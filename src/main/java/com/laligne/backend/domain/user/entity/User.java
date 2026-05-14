package com.laligne.backend.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

//    @Enumerated(EnumType.STRING)
//    private Role role; // ADMIN, USER 등 (Enum은 나중에 만드셔도 됩니다. 우선 String으로 두셔도 무방!)
}
