package com.cinema.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MOVIE")
@Builder
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOVIE_ID")
    private Integer id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DIRECTOR")
    private String director;
    @Column(name = "RELEASE_DATE")
    private Date release;
    @Column(name = "URL")
    private String url;
    @Column(name = "SYNOPSIS")
    private String synopsis;

    @JsonIgnore
    @OneToMany(mappedBy = "id.movie")
    List<MovieCategory> categories  ;
    @JsonIgnore
    @OneToMany(mappedBy = "movie")
    List<Booking> bookings;
}
