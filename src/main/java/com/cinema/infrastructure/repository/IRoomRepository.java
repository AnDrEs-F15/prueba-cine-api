package com.cinema.infrastructure.repository;

import com.cinema.infrastructure.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer> {
}
