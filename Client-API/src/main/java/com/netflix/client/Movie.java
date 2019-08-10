package com.netflix.client;


public class Movie {
    private Long id;
    private Integer categoryid;

    private String type;

    private String title;

    private String description;

    private Integer userid;

//    public Movie(Category categoryid, String type) {
//        this.categoryid = categoryid;
//        this.type = type;
//    }

    public Movie(Integer categoryid, String type, String title, String description, Integer userid) {
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

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
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
