package com.cinema.application.api;

import com.cinema.domain.constants.AppPaths;
import com.cinema.domain.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(AppPaths.MOVIES_PATH)
public interface IMovieApi {

    @GetMapping
    ResponseEntity<List<MovieDto>> getAll ();
    @GetMapping("/{id}")
    ResponseEntity<MovieDto> getById (@PathVariable(value = "id") int id );
    @PostMapping
    ResponseEntity<MovieDto> save (@RequestBody MovieDto dto );

}
