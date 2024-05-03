package com.cinema.domain.services.interfaz;

import com.cinema.domain.dto.BookingDto;

import java.util.List;

public interface IBookingServices {
    BookingDto save (BookingDto dto);
    List<BookingDto> findByClient (String id);
}
