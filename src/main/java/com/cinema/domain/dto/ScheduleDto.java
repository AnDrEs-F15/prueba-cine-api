package com.cinema.domain.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor @NoArgsConstructor
public class ScheduleDto {
    private int id;
    private Date date;
    private int hourStart;
    private int hourEnd;
}
