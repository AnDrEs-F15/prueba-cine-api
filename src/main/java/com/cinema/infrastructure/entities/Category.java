package com.cinema.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "CATEGORY")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORY")
    private long id;
    @Column(name = "NAME_CATEGORY")
    private String name;
    @OneToMany(mappedBy = "id.category")
    List<MovieCategory> movies ;
}
