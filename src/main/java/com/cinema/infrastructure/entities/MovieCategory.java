package com.cinema.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MOVIE_CATEGORY")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MovieCategory {
    @EmbeddedId
    private MovieCategoryPk id;

}
