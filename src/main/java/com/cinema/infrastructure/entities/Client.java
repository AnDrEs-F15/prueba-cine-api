package com.cinema.infrastructure.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "CLIENT")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Client {
    @Id
    @Column(name = "CLIENT_ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    List<Booking> bookings;
}
