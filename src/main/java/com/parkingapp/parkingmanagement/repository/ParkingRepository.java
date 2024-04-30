package com.parkingapp.parkingmanagement.repository;

import com.parkingapp.parkingmanagement.model.Parking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingRepository  extends MongoRepository<Parking, String> {
}
