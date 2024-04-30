package com.parkingapp.parkingmanagement.repository;

import com.parkingapp.parkingmanagement.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
