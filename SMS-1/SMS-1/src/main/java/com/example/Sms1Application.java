package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Station;
import com.example.Repository.StationRepository;


@SpringBootApplication
public class Sms1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sms1Application.class, args);
	}

	@Autowired
	private StationRepository stationRepository;
	@Override
	public void run(String... args) throws Exception {
		/*
		Station station1=new Station("Andheri","NO. 1",10011,"Bhopal Express","12:10 PM","Super Fast");
		stationRepository.save(station1);
		
		Station station2=new Station("Andheri","NO. 2",10011,"Delhi Express","6:02 PM","Super Fast");
		stationRepository.save(station2);
		*/
	}

}
