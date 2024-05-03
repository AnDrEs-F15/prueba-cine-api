package com.cinema.domain.services.interfaz;

import com.cinema.domain.dto.MovieDto;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

public interface IMovieServices {
    MovieDto save (MovieDto dto);
    MovieDto getById (int id);
    List<MovieDto> getAll ();


}
