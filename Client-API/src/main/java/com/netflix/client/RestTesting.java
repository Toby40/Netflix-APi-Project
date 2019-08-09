package com.netflix.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate=new RestTemplate();
    // Registering are user
        User newuser=new User("Mary",6);
        User createdUser = restTemplate.postForObject(
                "http://10.53.46.117/8080/api/register",
                newuser, User.class);
        System.out.println(createdUser.toString());

        //Listing movies

        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://10.53.46.117:8080/api/1/action",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>(){});
        List<Movie> movies = response.getBody();

        for(Movie movie : movies){
            System.out.println(movie.toString());
        }
        System.err.println("Find One(GET)--------------------------------");

        Movie movie = restTemplate.getForObject(
                "http://10.53.46.117:8080/api/2/action",
                Movie.class);
        System.out.println(movie.toString());

        System.err.println("Creating(POST)______________________________");
    }

    // Updating movies
   // Movie movie=new Movie(1,"")

}
