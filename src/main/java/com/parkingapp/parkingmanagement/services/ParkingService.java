package com.parkingapp.parkingmanagement.services;

import com.parkingapp.parkingmanagement.dto.ParkingDTO;
import com.parkingapp.parkingmanagement.model.Parking;
import com.parkingapp.parkingmanagement.repository.ParkingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
  final ParkingRepository repository;

  final ModelMapper modelMapper;

  public ParkingService(ParkingRepository repository, ModelMapper modelMapper) {
    this.repository = repository;
    this.modelMapper = modelMapper;
  }

  public Parking create(ParkingDTO parkingDTO) {
    Parking parking = modelMapper.map(parkingDTO, Parking.class);
    return repository.save(parking);
  }

  public List<ParkingDTO> getAllParkings(){
    List<Parking> sensorList = repository.findAll();

    List<ParkingDTO> parkingDTOList = new ArrayList<>();
    sensorList.forEach( x ->
            parkingDTOList.add(modelMapper.map(x, ParkingDTO.class))
    );
    return parkingDTOList;
  }
}
