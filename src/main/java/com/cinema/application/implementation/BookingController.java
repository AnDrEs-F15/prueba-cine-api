package com.cinema.application.implementation;

import com.cinema.application.api.IBookingApi;
import com.cinema.domain.dto.BookingDto;
import com.cinema.domain.services.interfaz.IBookingServices;
import com.cinema.infrastructure.entities.Booking;
import com.cinema.infrastructure.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController implements IBookingApi {
    @Autowired
    private IBookingServices bookingServices;
    @Override
    public ResponseEntity<BookingDto> save(BookingDto data) {
        BookingDto response = new BookingDto();
        response.setId(3);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<List<BookingDto>> findAllByClient(String idClient) {
        return ResponseEntity.ok(bookingServices.findByClient(idClient));
    }
    @Autowired
    BookingRepository repository;
    @GetMapping("/all")
    List<Booking> getAll () {
        return repository.findAllByClientId("100578291").get();
    }
}
