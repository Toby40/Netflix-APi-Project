package com.netflix.client;


public class Movie {
    private Long id;
    private Category categoryid;

    private String type;

    private String title;

    private String description;

    private User userid;

    public Movie(Category categoryid, String type) {
        this.categoryid = categoryid;
        this.type = type;
    }

    public Movie(Category categoryid, String type, String title, String description, User userid) {
        this.categoryid = categoryid;
        this.type = type;
        this.title = title;
        this.description = description;
        this.userid = userid;
    }

    private Movie(){}

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
