package com.netflix.api;

import com.netflix.api.Model.Category;
import com.netflix.api.Model.Movie;
import com.netflix.api.Repository.MovieRepository;
import com.netflix.api.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final UserRepository userRepository;


    public DummyData(MovieRepository movieRepository, UserRepository userRepository) {
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie1=new Movie("","Action","No where to run","Acted by jean claud verndame",1);

        Movie movie2=new Movie(" ","Horror","IT","Acted by Bill hader ",0);

        Movie movie3=new Movie(" ","Series","Game of thrones","Acted by jean Jones snow",2);

        Movie movie4=new Movie(" ","ScienceFiction","Avengers","Acted by Chris Evans",3);

        Movie movie5=new Movie(" ","Comedy","Ride alone","Acted Kevin Hat",4);

        movieRepository.saveAll(Arrays.asList(movie1,movie2,movie3,movie4,movie5));
    }
}
