package com.melvinsalas.museumrate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Exhibition {
    private int id;
    private String name;
    private String picture;
    private String description;
    private String artist;
    private int year;
}
