package com.cinema.domain.mappers;

import com.cinema.domain.dto.RoomDto;
import com.cinema.infrastructure.entities.Room;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IRoomMapper {
    RoomDto toDto (Room room);
    List<RoomDto> toDto (List<Room> room);
}
