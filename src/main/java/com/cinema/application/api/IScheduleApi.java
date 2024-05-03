package com.cinema.application.api;

import com.cinema.domain.constants.AppPaths;
import com.cinema.infrastructure.entities.Schedule;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(AppPaths.SCHEDULE_PATH)
public interface IScheduleApi {
    @GetMapping
    ResponseEntity<List<Schedule>> getAll ();
}
