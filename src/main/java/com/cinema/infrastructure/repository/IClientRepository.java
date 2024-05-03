package com.cinema.infrastructure.repository;

import com.cinema.infrastructure.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client,String> {
}
