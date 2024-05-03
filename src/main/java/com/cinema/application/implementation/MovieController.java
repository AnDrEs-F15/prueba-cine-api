package com.cinema.application.implementation;

import com.cinema.application.api.IMovieApi;
import com.cinema.domain.dto.MovieDto;
import com.cinema.domain.services.interfaz.IMovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController implements IMovieApi {
    @Autowired
    private IMovieServices services;

    @Override
    public ResponseEntity<List<MovieDto>> getAll() {
        return ResponseEntity.ok(services.getAll());
    }

    @Override
    public ResponseEntity<MovieDto> getById(int id) {
        return ResponseEntity.ok(services.getById(id));
    }

    @Override
    public ResponseEntity<MovieDto> save(MovieDto dto) {
        return new ResponseEntity<>(services.save(dto), HttpStatus.CREATED);
    }
}
