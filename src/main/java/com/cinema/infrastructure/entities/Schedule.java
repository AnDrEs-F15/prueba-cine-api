package com.cinema.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SCHEDULE")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHEDULE_ID")
    private int id;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "HOUR_START")
    private int hourStart;
    @Column(name = "HOUR_END")
    private int hourEnd;
    @JsonIgnore
    @OneToMany(mappedBy = "schedule")
    List<Booking> bookings;
}
