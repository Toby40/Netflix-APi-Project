package com.netflix.api.Model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "type")
    private String movie_type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = true)
    private int userid;



    public Movie(Category category, String movie_type, String title, String description, int userid) {
        this.category = category;
        this.movie_type = movie_type;
        this.title = title;
        this.description = description;
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
