package com.example.Service;
import java.util.*;

import com.example.Entity.Station;


public interface StationService 
{
	List<Station> getAllStations();
	
	Station savedetails(Station station);

	Station getStationById(Long id);
	
	Station updatedetails(Station station);
	
	void deleteStationById(Long id);

}
