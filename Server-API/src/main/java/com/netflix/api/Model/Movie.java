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
//    @Column(name = "categoryid")
    private Category categoryid;

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


    public Movie( String movie_type, String title, String description) {
//        this.category_id=category_id;
        this.type = movie_type;
        this.title = title;
        this.description = description;


    }
    private Movie(){


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Category categoryid) {
        this.categoryid = categoryid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
