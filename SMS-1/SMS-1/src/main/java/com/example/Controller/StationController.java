package com.example.Controller;

import com.example.Entity.Station;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Service.StationService;

@Controller
public class StationController {

	private StationService stationService;

	public StationController(StationService stationService) {
		super();
		this.stationService = stationService;
	}
	
	//handler method to handle list students and return mode and view
	@GetMapping("/stations")
	public String ListStations(Model model)
	{
		model.addAttribute("stations",stationService.getAllStations());
		return "stations";
	}
	
	@GetMapping("/stations/new")
	public String createNewDetials(Model model)
	{
		Station station=new Station();
		model.addAttribute("station", station);
		return "create_new";
	}
	@PostMapping("/stations")
	public String saveDetails(@ModelAttribute("station")Station station)
	{
		stationService.savedetails(station);
		return "redirect:/stations";
	}
	
	@GetMapping("/stations/edit/{id}")
	public String editdetails(@PathVariable Long id, Model model) 
	{
		model.addAttribute("station",stationService.getStationById(id));
		return "edit_station";
	}
	
	
	
	
	@PostMapping("/stations/{id}")
	public String updatetheDetails(@PathVariable Long id,
			@ModelAttribute("station") Station station,
			Model model) 
	{
		//get station from database
		Station existingdetails = stationService.getStationById(id);
		existingdetails.setId(id);
		existingdetails.setStation_name(station.getStation_name());
		existingdetails.setPlatform_number(station.getPlatform_number());
		existingdetails.setTrain_number(station.getTrain_number());
		existingdetails.setTrain_name(station.getTrain_name());
		existingdetails.setTrain_time(station.getTrain_time());
		existingdetails.setTrain_type(station.getTrain_type());
		
		stationService.updatedetails(existingdetails);
		return "redirect:/stations";
		
	}
	//handler method to delete station reques
	@GetMapping("/stations/{id}")
	public String deletedetails(@PathVariable Long id) 
	{
		stationService.deleteStationById(id);
		return "redirect:/stations";
		}
}




