package com.cinema.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ROOM")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID")
    private int id;
    @Column(name = "ROOM_NAME")
    private String name;
    @Column(name = "ROOM_DESC")
    private String description;
    @Column(name = "CAPACITY")
    private int capacity;
    @JsonIgnore
    @OneToMany(mappedBy = "room")
    List<Booking> bookings;
}
