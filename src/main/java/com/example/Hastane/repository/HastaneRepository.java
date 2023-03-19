package com.example.Hastane.repository;

import com.example.Hastane.model.Hastane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HastaneRepository extends JpaRepository<Hastane, Long> {
}
