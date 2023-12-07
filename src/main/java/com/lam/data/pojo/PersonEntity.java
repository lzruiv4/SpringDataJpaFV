package com.lam.data.pojo;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "persons")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pId")
    private UUID personId;

    @Column
    private String name;

    @Column
    private String address;
}
