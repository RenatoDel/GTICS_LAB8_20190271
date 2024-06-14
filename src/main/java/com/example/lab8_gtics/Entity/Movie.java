package com.example.lab8_gtics.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "idmovie", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "language", nullable = false, length = 45)
    private String language;

    @Column(name = "lanzamientodia", nullable = false, length = 45)
    private String dia;

    @ManyToOne
    @JoinColumn(name = "iduser", nullable = false)
    private User user;
}
