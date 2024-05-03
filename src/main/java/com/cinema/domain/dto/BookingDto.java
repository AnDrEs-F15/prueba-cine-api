package com.cinema.domain.dto;

import com.cinema.infrastructure.entities.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class BookingDto {
    private int id;
    private int client;
    private int room;
    private int schedule;
    private int movie;
}
