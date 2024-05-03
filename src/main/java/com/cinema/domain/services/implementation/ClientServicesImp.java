package com.cinema.domain.services.implementation;

import com.cinema.domain.constants.AppMessage;
import com.cinema.domain.dto.ClientDto;
import com.cinema.domain.exception.AppException;
import com.cinema.domain.mappers.IClientMapper;
import com.cinema.domain.services.interfaz.IClientServices;
import com.cinema.infrastructure.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ClientServicesImp  implements IClientServices {
    @Autowired
    private IClientRepository repository;
    @Autowired
    private IClientMapper mapper;
    @Override
    public ClientDto save(ClientDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public ClientDto getByIdClient(String id) {
        return mapper.toDto(
                repository.findById(id)
                        .orElseThrow(()-> new AppException(AppMessage.NOT_FOUND_MESSAGE, HttpStatus.NOT_FOUND ))
        ) ;
    }
}
