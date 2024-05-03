package com.cinema.application.api;

import com.cinema.domain.constants.AppPaths;
import com.cinema.domain.dto.BookingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(AppPaths.BOOKING_PATH)
public interface IBookingApi {
    @PostMapping
    ResponseEntity<BookingDto> save (@RequestBody BookingDto data );
    @GetMapping("/{id}")
    ResponseEntity<List<BookingDto>> findAllByClient (@PathVariable(value = "id") String idClient);
}
