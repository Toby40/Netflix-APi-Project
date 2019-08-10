package com.netflix.api.Model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "categoryid",targetEntity = Movie.class)

    private Movie movie;

    public Category(String name){
        this.name = name;
    }

    private Category(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
