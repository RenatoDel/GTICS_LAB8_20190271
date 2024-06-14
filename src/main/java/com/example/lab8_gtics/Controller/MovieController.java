package com.example.lab8_gtics.Controller;

import com.example.lab8_gtics.Entity.Movie;
import com.example.lab8_gtics.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Endpoint para obtener todos los Pokémon capturados por un usuario

    @GetMapping("/movie/{now_playing}")
    public ResponseEntity<List<Movie>> getMovieByUser(@PathVariable Long id) {
        List<Movie> movies = movieService.getMovieById(id);
        return ResponseEntity.ok(movies);
    }


}
