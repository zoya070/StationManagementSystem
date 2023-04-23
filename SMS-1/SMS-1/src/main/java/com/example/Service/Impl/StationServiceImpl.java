package com.example.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Station;
import com.example.Repository.StationRepository;
import com.example.Service.StationService;

@Service
public class StationServiceImpl implements StationService

{

	private StationRepository stationRepository;
	
	

	public StationServiceImpl(StationRepository stationRepository) {
		super();
		this.stationRepository = stationRepository;
	}

	@Override
	public List<Station> getAllStations() {
		
		return stationRepository.findAll();
	}

	@Override
	public Station savedetails(Station station) {
		
		return stationRepository.save(station);
	}

	@Override
	public Station getStationById(Long id) {
	return stationRepository.findById(id).get();
	}

	@Override
	public Station updatedetails(Station station) {
	
		return stationRepository.save(station);
	}

	@Override
	public void deleteStationById(Long id) {
		stationRepository.deleteById(id);
		
	}

	
	
	
}
