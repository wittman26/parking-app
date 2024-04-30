package com.parkingapp.parkingmanagement.repository;

import com.parkingapp.parkingmanagement.model.Spot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpotRepository  extends MongoRepository<Spot, String> {
}
