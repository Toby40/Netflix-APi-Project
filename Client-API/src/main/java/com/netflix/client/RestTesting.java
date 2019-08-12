package com.netflix.client;

import org.springframework.boot.CommandLineRunner;
//<<<<<<< Updated upstream
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
        User newUser=new User("Mary",6);
        User createdUser = restTemplate.postForObject(
                "http://localhost:8080/api/register",newUser, User.class);
        System.out.println(createdUser.toString());

        //Listing movies

        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://localhost:8080/api/1/action",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>(){});
        List<Movie> movies = response.getBody();
             System.out.println(movies);
        for(Movie movie : movies){
            System.out.println(movie.toString());
        }
        System.err.println("Find One(GET)--------------------------------");

        Movie movie = restTemplate.getForObject(
                "http://localhost:8080/api/2/action",
                Movie.class);
        System.out.println(movie.toString());

        System.err.println("Creating(POST)______________________________");
        // Updating movie suggestions
        Movie newMovie=new Movie(1,"Series","legend of the seeker","Acted by Sharon stocks", newUser.getId());
        Movie createdMovie=restTemplate.postForObject(
                "http://localhost:8080/api/" + newUser.getId() + "/suggestion/update",
                newMovie,
                Movie.class
        );
        System.out.println(createdMovie.toString());

        //Delete suggestions
        Movie deleteMovie=restTemplate.postForObject("http://localhost:8080/api/" + newUser.getId() + "/suggestion/delete",newMovie,Movie.class);

        System.out.println(deleteMovie.toString());

    }



//=======

/*public class RestTesting implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
>>>>>>> Stashed changes*/
}
