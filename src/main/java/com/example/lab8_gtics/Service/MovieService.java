package com.example.lab8_gtics.Service;

import com.example.lab8_gtics.Entity.Movie;
import com.example.lab8_gtics.Repository.MovieRepository;
import com.example.lab8_gtics.Repository.UserRepository;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService {
    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovieById(Long id) {
        return movieRepository.findByUserId(id);
    }

    // Otros métodos del servicio como saveMovie(), updateMovie(), deleteMovie(), etc.
}
