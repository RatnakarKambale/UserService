package com.icwd.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "micro_users")
public class Users {
    @Id
    @Column(name= "ID")
    private String userId;
    @Column(name= "NAME")
    private String name;
    @Column(name= "EMAIL")
    private String email;
    @Column(name= "ABOUT")
    private String about;
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
