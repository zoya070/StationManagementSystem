package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stations")
public class Station {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="station_name", nullable=false)
	private String station_name;
	
	@Column(name="platform_number")
	private String platform_number;
	
	@Column(name="train_number")
	private int train_number;
	
	@Column(name="train_name")
	private String train_name;
	
	@Column(name="train_time")
	private String train_time;
	
	@Column(name="train_type")
	private String train_type;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getPlatform_number() {
		return platform_number;
	}
	public void setPlatform_number(String platform_number) {
		this.platform_number = platform_number;
	}
	public int getTrain_number() {
		return train_number;
	}
	public void setTrain_number(int train_number) {
		this.train_number = train_number;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_time() {
		return train_time;
	}
	public void setTrain_time(String train_time) {
		this.train_time = train_time;
	}
	public String getTrain_type() {
		return train_type;
	}
	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}
	
	public Station() {}
	
	public Station(String station_name, String platform_number, int train_number, String train_name, String train_time,
			String train_type) {
		super();
		this.station_name = station_name;
		this.platform_number = platform_number;
		this.train_number = train_number;
		this.train_name = train_name;
		this.train_time = train_time;
		this.train_type = train_type;
	}
	
	
	

}
