package com.example.lab8_gtics.Repository;

import com.example.lab8_gtics.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByUserId(Long id);
}
