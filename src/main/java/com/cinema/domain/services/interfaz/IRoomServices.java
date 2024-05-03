package com.cinema.domain.services.interfaz;

import com.cinema.domain.dto.RoomDto;
import com.cinema.infrastructure.entities.Room;

import java.util.List;

public interface IRoomServices {
    List<RoomDto> getAll ();
}
