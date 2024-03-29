package com.netflix.api.Model;

import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "identifaction_number")
    private int id_no;

    @OneToMany(mappedBy = "userid",targetEntity = Movie.class)
    @SortNatural
    private List<Movie> movie;

    public User(String name, int id_no) {
        this.name = name;
        this.id_no = id_no;
    }

    private User(){}

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

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
