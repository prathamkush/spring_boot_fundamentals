package com.spring.boot.restAPI.SpringBootRestAPI.movieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return Arrays.asList(new Movie(1, "MI", 8.9),
                new Movie(2, "MI2", 9.0),
                new Movie(3, "MI3", 8.8),
                new Movie(4, "MI4", 8.0)
                );
    }




}
