package com.netflix.client;

//<<<<<<< Updated upstream

public class Movie {
    private Long id;
    private Integer categoryId;

    private String type;

    private String title;

    private String description;

    private Integer userId;

//    public Movie(Category categoryId, String type) {
//        this.categoryId = categoryId;
//        this.type = type;
//    }

    public Movie(Integer categoryId, String type, String title, String description, Integer userId) {
        this.categoryId = categoryId;
        this.type = type;
        this.title = title;
        this.description = description;
        this.userId = userId;
    }

    private Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryid(Integer categoryId) {
        this.categoryId = categoryId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", categoryid=" + categoryId +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", userid=" + userId +
                '}';
    }

}