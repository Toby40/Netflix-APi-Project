package com.netflix.api.Controller;

import com.netflix.api.Model.Movie;
import com.netflix.api.Model.User;
import com.netflix.api.NotFoundException;
import com.netflix.api.Repository.MovieRepository;
import com.netflix.api.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class NetflixController {
    private final UserRepository userRepository;
    private final MovieRepository movieRepository;



    public NetflixController(UserRepository userRepository, MovieRepository movieRepository){
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;

    }

    @PostMapping(value = "register")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping(value = "{categoryid}/{type}")
    public List<Movie> findByCategoryIdandType(@PathVariable int categoryid, @PathVariable String type){
        return movieRepository.findByCategoryidAndType(categoryid,type);
    }

    @PostMapping(value = "{userid}/suggestion/create")
    public Movie createMovieSuggestion(@RequestBody Movie movie,@PathVariable int userid){

//        movie.setCategory(movie.getCategory());
//        movie.setDescription(movie.getDescription());
//        movie.setMovie_type(movie.getMovie_type());
//        movie.setTitle(movie.getTitle());
//        movie.setUserid(userid);

        return movieRepository.save(movie);
    }

    @PatchMapping(value = "{userid}/suggestion/update")
    public Movie updateMovieSuggestion(@PathVariable Long userid, @RequestBody Movie movie){
        Movie foundMovie = movieRepository.findById(userid).orElseThrow(()->new NotFoundException("No movie associated with user id" + userid
        + "found"));

        return foundMovie;
    }

    @DeleteMapping(value = "{userid}/suggestion/delete")
    public void deleteMovie(@PathVariable Long userid){
        movieRepository.deleteById(userid);
    }


}
