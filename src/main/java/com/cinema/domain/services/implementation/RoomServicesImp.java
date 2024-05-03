package com.cinema.domain.services.implementation;

import com.cinema.domain.dto.RoomDto;
import com.cinema.domain.mappers.IRoomMapper;
import com.cinema.domain.services.interfaz.IRoomServices;
import com.cinema.infrastructure.entities.Room;
import com.cinema.infrastructure.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServicesImp implements IRoomServices {
    @Autowired
    private IRoomRepository repository;
    @Autowired
    private IRoomMapper mapper;
    @Override
    public List<RoomDto> getAll() {
        return mapper.toDto(repository.findAll());
    }
}
