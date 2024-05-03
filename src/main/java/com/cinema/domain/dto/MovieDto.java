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
public class MovieDto {
    private Integer id;
    private String title;
    private String director;
    private Date release;
    private String url;
    private String synopsis;
}
