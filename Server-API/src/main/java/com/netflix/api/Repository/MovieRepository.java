package com.netflix.api.Repository;

import com.netflix.api.Model.Category;
import com.netflix.api.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    // Select * from movies
    List<Movie> findAll();

    List<Movie> findByCategoryidAndType(Category categoryid, String type);

    List<Movie> findById(int id);
}
