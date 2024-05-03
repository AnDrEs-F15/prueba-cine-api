package com.cinema.application.implementation;

import com.cinema.application.api.IClientApi;
import com.cinema.domain.dto.ClientDto;
import com.cinema.domain.services.interfaz.IClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController implements IClientApi {
    @Autowired
    private IClientServices services;
    @Override
    public ResponseEntity<ClientDto> getById(String id) {
        return ResponseEntity.ok(services.getByIdClient(id));
    }
    @Override
    public ResponseEntity<ClientDto> save(ClientDto dto) {
        return new ResponseEntity<>(services.save(dto) , HttpStatus.CREATED  );
    }
}
