package com.safety.nets.alerts.Safety.Nets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.FireStation;



public interface FireStationRepository extends JpaRepository<FireStation, Integer>{

	List<FireStation> findByAddress(String address);

}
