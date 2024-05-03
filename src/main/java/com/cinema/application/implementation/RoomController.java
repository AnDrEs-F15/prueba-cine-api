package com.cinema.application.implementation;

import com.cinema.application.api.IRoomApi;
import com.cinema.domain.dto.RoomDto;
import com.cinema.domain.services.interfaz.IRoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController implements IRoomApi {
    @Autowired
    private IRoomServices services;
    @Override
    public ResponseEntity<List<RoomDto>> getAll() {
        return ResponseEntity.ok(services.getAll());
    }
}
