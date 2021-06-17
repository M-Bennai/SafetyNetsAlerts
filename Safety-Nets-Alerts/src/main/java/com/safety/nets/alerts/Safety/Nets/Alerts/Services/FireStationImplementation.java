package com.safety.nets.alerts.Safety.Nets.Alerts.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.FireStation;
import com.safety.nets.alerts.Safety.Nets.Repository.FireStationRepository;

@Service
public class FireStationImplementation implements FireStationService {
	
	FireStationRepository fireStationRepository;
	
	@Autowired
	public FireStationImplementation(FireStationRepository fireStationRepository) {
		this.fireStationRepository = fireStationRepository;
	}

	@Override
	public void addFireStation(FireStation fireStation) {
		fireStationRepository.save(fireStation);
		
	}

	@Override
	public List<FireStation> getAllFireStation() {
		return fireStationRepository.findAll();
	}

	@Override
	public FireStation getFireStationById(int id) {
		return fireStationRepository.getById(id);
	}

	@Override
	public void deleteFireStationById(int id) {
		fireStationRepository.deleteById(id);
		
	}

	//@Override
	//public FireStation getFireStationByAddress(String address) {
	//	return fireStationRepository.findByAddress(address);
	//}


	@Override
	public FireStation updateFireStationById(FireStation fireStation) {
		FireStation existingFireStation = fireStationRepository.findById(fireStation.getId()).orElse(null);
		existingFireStation.setStation(fireStation.getStation());
		existingFireStation.setAddress(fireStation.getAddress());
		
		return fireStationRepository.save(existingFireStation);
	}

}
