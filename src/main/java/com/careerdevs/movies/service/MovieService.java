package com.careerdevs.movies.service;

import com.careerdevs.movies.Movie;
import com.careerdevs.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @GetMapping
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie (String imdbId){
        return  movieRepository.findMovieByImdbId(imdbId);

    }
}
