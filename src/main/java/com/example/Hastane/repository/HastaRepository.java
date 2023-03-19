package com.example.Hastane.repository;

import com.example.Hastane.model.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HastaRepository extends JpaRepository<Hasta,Long> {
}
