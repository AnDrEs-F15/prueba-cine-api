package com.cinema.infrastructure.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieCategoryPk {
    @JoinColumn(name = "MOVIE_ID" , referencedColumnName = "MOVIE_ID")
    @ManyToOne
    private Movie movie;
    @JoinColumn(name = "ID_CATEGORY" , referencedColumnName = "ID_CATEGORY")
    @ManyToOne
    private Category category;
}
