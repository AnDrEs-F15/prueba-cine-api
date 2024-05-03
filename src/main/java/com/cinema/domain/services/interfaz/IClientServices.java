package com.cinema.domain.services.interfaz;

import com.cinema.domain.dto.ClientDto;

public interface IClientServices {
    ClientDto save (ClientDto dto);
    ClientDto getByIdClient (String id);
}
