package com.cinema.application.api;

import com.cinema.domain.constants.AppPaths;
import com.cinema.domain.dto.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(AppPaths.CLIENT_PATH)
public interface IClientApi {
    @GetMapping("/{id}")
    ResponseEntity<ClientDto> getById (@PathVariable(value = "id") String id );
    @PostMapping
    ResponseEntity<ClientDto> save (@RequestBody ClientDto dto );
}
