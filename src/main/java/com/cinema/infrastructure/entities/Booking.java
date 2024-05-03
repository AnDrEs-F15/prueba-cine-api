package com.cinema.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BOOKING")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_ID")
    private Integer id;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID")
    @ManyToOne
    private Client client;
    @JoinColumn(name = "ROOM_ID" , referencedColumnName = "ROOM_ID")
    @ManyToOne
    private Room room;
    @JoinColumn(name = "SCHEDULE_ID" , referencedColumnName = "SCHEDULE_ID")
    @ManyToOne
    private Schedule schedule;
    @JoinColumn(name = "MOVIE_ID" , referencedColumnName = "MOVIE_ID")
    @ManyToOne
    private Movie movie;

}
