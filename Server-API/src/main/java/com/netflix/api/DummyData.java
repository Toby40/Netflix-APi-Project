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

       // Category category1 = new Category("Action");
       // Category category2 = new Category("Horror");
      //  Category category3 = new Category("Series");
      //  Category category4 = new Category("ScienceFiction");
      //  Category category5 = new Category("Comedy");
      //  categoryRepository.saveAll(Arrays.asList(category1,category2,category3,category4,category5));

        //create users
      //  User user1 = new User("Tobias",6575);
      //  User user2 = new User("Joy", 8797);
      //  User user3 = new User("Evans",7686);
      //  User user4 = new User("Adrian",8990);
      //  User user5 = new User("Ted",5678);
      //  userRepository.saveAll(Arrays.asList(user1,user2,user3,user4,user5));

        //create movies
       // Movie movie1=new Movie(1,"Original","No where to run","Acted by jean claud verndame",user1);
        Movie movie1=new Movie("original","IT","Acted by Bill hader");
        Category category1 = categoryRepository.save(new Category("Horror"));
        movie1.setCategoryid(category1);
        User user1=userRepository.save(new User("Tobias",6575));
        movie1.setUserid(user1);

        Movie movie2=new Movie("suggested","Game of thrones","Acted by Jones snow");
        Category category2 = categoryRepository.save(new Category("Series"));
        movie2.setCategoryid(category2);
        User user2=userRepository.save(new User("Joy",8797));
        movie2.setUserid(user2);

        Movie movie3=new Movie("original","No where to run","Acted by Jean Claude verndame");
        Category category3 = categoryRepository.save(new Category("Action"));
        movie3.setCategoryid(category3);
        User user3=userRepository.save(new User("Evans",7686));
        movie3.setUserid(user3);

        Movie movie4=new Movie("original","Avengers","Acted by Chris Evans");
        Category category4 = categoryRepository.save(new Category("science fiction"));
        movie4.setCategoryid(category4);
        User user4=userRepository.save(new User("Adrian",8990));
        movie4.setUserid(user4);

        Movie movie5=new Movie("suggsted","Ride alone","Acted by Kevin Hart");
        Category category5 = categoryRepository.save(new Category("comedy"));
        movie5.setCategoryid(category5);
        User user5=userRepository.save(new User("Ted",5678));
        movie5.setUserid(user5);

       // Movie movie2=new Movie(2,"original","IT","Acted by Bill hader ", user5);

       // Movie movie3=new Movie(3,"suggested","Game of thrones","Acted by jean Jones snow",user3);

       // Movie movie4=new Movie(4,"original","Avengers","Acted by Chris Evans",user2);

      //  Movie movie5=new Movie(5,"suggested","Ride alone","Acted by Kevin Hart",user4);
      //  movieRepository.save(movie1);
       movieRepository.saveAll(Arrays.asList(movie1,movie2,movie3,movie4,movie5));

    }
}
