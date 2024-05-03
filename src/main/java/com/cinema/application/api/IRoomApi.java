package com.cinema.application.api;

import com.cinema.domain.constants.AppPaths;
import com.cinema.domain.dto.RoomDto;
import com.cinema.domain.services.interfaz.IRoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(AppPaths.ROOM_PATH)
public interface IRoomApi {

    @GetMapping
    ResponseEntity<List<RoomDto>> getAll();
}
