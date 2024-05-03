package com.cinema.domain.mappers;

import com.cinema.domain.dto.ClientDto;
import com.cinema.infrastructure.entities.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IClientMapper {
    ClientDto toDto (Client client);
    Client toEntity (ClientDto dto);
}
