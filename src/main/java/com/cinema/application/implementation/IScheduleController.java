package com.cinema.application.implementation;

import com.cinema.application.api.IScheduleApi;
import com.cinema.domain.services.interfaz.IScheduleServices;
import com.cinema.infrastructure.entities.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class IScheduleController implements IScheduleApi {
    @Autowired
    private IScheduleServices services;
    @Override
    public ResponseEntity<List<Schedule>> getAll() {
        return new ResponseEntity<>(services.getAll(), HttpStatus.OK );
    }
}
