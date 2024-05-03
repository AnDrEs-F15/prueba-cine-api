package com.cinema.domain.services.implementation;

import com.cinema.domain.constants.AppMessage;
import com.cinema.domain.dto.MovieDto;
import com.cinema.domain.exception.AppException;
import com.cinema.domain.mappers.IMovieMapper;
import com.cinema.domain.services.interfaz.IMovieServices;
import com.cinema.infrastructure.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServicesImp implements IMovieServices {
    @Autowired
    private MovieRepository repository;
    @Autowired
    private IMovieMapper mapper;

    @Override
    public List<MovieDto> getAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public MovieDto save(MovieDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public MovieDto getById(int id) {
          return mapper.toDto(
                  repository.findById(id)
                          .orElseThrow( ()-> new AppException(AppMessage.NOT_FOUND_MESSAGE, HttpStatus.NOT_FOUND  )  )
          );


    }
}
