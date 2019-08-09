package com.netflix.api;

import com.netflix.api.Model.Category;
import com.netflix.api.Model.Movie;
import com.netflix.api.Model.User;
import com.netflix.api.Repository.CategoryRepository;
import com.netflix.api.Repository.MovieRepository;
import com.netflix.api.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DummyData implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;


    public DummyData(MovieRepository movieRepository, UserRepository userRepository, CategoryRepository categoryRepository) {
        this.movieRepository = movieRepository;
        this.userRepository = userRepository;

        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //create categories

        Category category1 = new Category("Action");
        Category category2 = new Category("Horror");
        Category category3 = new Category("Series");
        Category category4 = new Category("ScienceFiction");
        Category category5 = new Category("Comedy");
        categoryRepository.saveAll(Arrays.asList(category1,category2,category3,category4,category5));

        //create users
        User user1 = new User("Tobias",6575);
        User user2 = new User("Joy", 8797);
        User user3 = new User("Evans",7686);
        User user4 = new User("Adrian",8990);
        User user5 = new User("Ted",5678);
        userRepository.saveAll(Arrays.asList(user1,user2,user3,user4,user5));

        //create movies
        Movie movie1=new Movie(category1,"Original","No where to run","Acted by jean claud verndame",user1);

        Movie movie2=new Movie(category2,"original","IT","Acted by Bill hader ", user5);

        Movie movie3=new Movie(category3,"suggested","Game of thrones","Acted by jean Jones snow",user3);

        Movie movie4=new Movie(category4,"original","Avengers","Acted by Chris Evans",user2);

        Movie movie5=new Movie(category5,"suggested","Ride alone","Acted by Kevin Hart",user4);

        movieRepository.saveAll(Arrays.asList(movie1,movie2,movie3,movie4,movie5));
    }
}
