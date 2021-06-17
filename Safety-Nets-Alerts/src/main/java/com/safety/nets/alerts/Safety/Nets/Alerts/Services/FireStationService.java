package com.safety.nets.alerts.Safety.Nets.Alerts.Services;

import java.util.List;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.FireStation;


public interface FireStationService  {
	
	void addFireStation (FireStation fireStation);
	List<FireStation> getAllFireStation(); 
	FireStation getFireStationById(int id);
	void deleteFireStationById(int id);
	FireStation updateFireStationById(FireStation fireStation);
	//FireStation getFireStationByAddress(String address);
	

}
