package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Station;

public interface StationRepository  extends JpaRepository<Station, Long>{

}
