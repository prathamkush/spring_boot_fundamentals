package com.spring.boot.restAPI.SpringBootRestAPI;

import com.spring.boot.restAPI.SpringBootRestAPI.movieRecommendation.Movie;
import com.spring.boot.restAPI.SpringBootRestAPI.movieRecommendation.RecommendationsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootRestApiApplication.class, args);


//		RecommendationsController obj = new RecommendationsController();
//		System.out.println(obj.getAllMovies());



	}

}
