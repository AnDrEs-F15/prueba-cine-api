package com.cinema.domain.services.implementation;

import com.cinema.domain.constants.AppMessage;
import com.cinema.domain.dto.BookingDto;
import com.cinema.domain.exception.AppException;
import com.cinema.domain.mappers.IBookingMapper;
import com.cinema.domain.services.interfaz.IBookingServices;
import com.cinema.infrastructure.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServicesImp implements IBookingServices {
    @Autowired
    private BookingRepository repository;
    @Autowired
    private IBookingMapper mapper;
    @Override
    public BookingDto save(BookingDto dto) {
        return null;
    }
    @Override
    public List<BookingDto> findByClient(String id) {
        return mapper.toDto(repository.findAllByClientId(id)
                .orElseThrow(()-> new AppException(AppMessage.NOT_FOUND_MESSAGE, HttpStatus.NOT_FOUND ) )
        );
    }
}
