package com.skorogod.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Retailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
