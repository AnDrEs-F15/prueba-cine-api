package com.cinema.infrastructure.repository;

import com.cinema.infrastructure.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule,Integer> {
}
