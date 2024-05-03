package com.cinema.domain.mappers;

import com.cinema.domain.dto.MovieDto;
import com.cinema.infrastructure.entities.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMovieMapper {
    @Mappings({
            @Mapping(target = "id" , source = "movie.id"),
            @Mapping(target = "title" ,source = "movie.title"),
            @Mapping(target = "director" , source = "movie.director"),
            @Mapping(target = "release", source = "movie.release"),
            @Mapping(target = "url", source = "movie.url"),
            @Mapping(target = "synopsis", source = "movie.synopsis")
    })
    MovieDto toDto (Movie movie);
    List<MovieDto> toDto (List<Movie> movie);
    Movie toEntity(MovieDto dto);
}
