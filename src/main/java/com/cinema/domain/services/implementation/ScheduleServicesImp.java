package com.cinema.domain.services.implementation;

import com.cinema.domain.services.interfaz.IScheduleServices;
import com.cinema.infrastructure.entities.Schedule;
import com.cinema.infrastructure.repository.IScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleServicesImp implements IScheduleServices {
    @Autowired
    private IScheduleRepository repository;
    @Override
    public List<Schedule> getAll() {
        return repository.findAll();
    }
}
