package com.safety.nets.alerts.Safety.Nets.Alerts.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.FireStation;

import com.safety.nets.alerts.Safety.Nets.Alerts.Services.FireStationService;

@RestController
public class FireStationController {
	
	@Autowired
	private FireStationService fireStationService;
	
	@GetMapping ("/firestation")
	public @ResponseBody List<FireStation> FireStationList(){
		List<FireStation> fireStationList = new ArrayList<>();
		fireStationList = fireStationService.getAllFireStation();
		return fireStationList;
	}
	
	@PostMapping("/addfirestation")
	public void addFireStation(@RequestBody FireStation fireStation) {
		fireStationService.addFireStation(fireStation);
	}
	
	@DeleteMapping("/deletefirestation/{id}")
	public void deleteFireStation(@PathVariable int id) {
		fireStationService.deleteFireStationById(id);
	}
	
	@PutMapping("/updatefirestation")
	public void updateFireStation(@RequestBody FireStation fireStation) {
		fireStationService.updateFireStationById(fireStation);
	}
	
	//@GetMapping("/firestationaddress")
	//public @ResponseBody List<FireStation> getFireStationByAddress(@PathVariable("address") String byAddress) {
		//List<FireStation>  fireStationAddress= new ArrayList<>();
		//fireStationAddress = fireStationService.getAllFireStation();
		//return fireStationAddress;
		
	//}

}
