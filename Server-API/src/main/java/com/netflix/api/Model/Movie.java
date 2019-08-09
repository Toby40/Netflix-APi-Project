package com.netflix.api.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},targetEntity = Category.class)
    @JoinColumn(name = "categoryid")
    private int categoryid;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},targetEntity = User.class)
    @JsonIgnore
    @JoinColumn(name = "user_id",nullable = true)
    @SortNatural
    private User userid;

    public Movie(int category_id, String movie_type, String title, String description,User userid) {
//        this.category_id=category_id;
        this.type = movie_type;
        this.title = title;
        this.description = description;
        this.userid=userid;
        this.categoryid = category_id;

    }

    private Movie(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCategory_id() {
        return categoryid;
    }

    public void setCategory_id(int category_id) {
        this.categoryid = category_id;
    }

    //    public String getCategory() {
//        return category_id;
//    }

//    public void setCategory(String category) {
//        this.category = category;
//    }

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
        return type;
    }

    public void setMovie_type(String movie_type) {
        this.type = movie_type;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", categoryid=" + categoryid +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userid=" + userid +
                '}';
    }
}
