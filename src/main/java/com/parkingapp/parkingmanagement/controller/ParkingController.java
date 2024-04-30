package com.parkingapp.parkingmanagement.controller;

import com.parkingapp.parkingmanagement.dto.ParkingDTO;
import com.parkingapp.parkingmanagement.dto.VehicleDTO;
import com.parkingapp.parkingmanagement.services.ParkingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("${basepath}/parking")
public class ParkingController {

  final ParkingService parkingService;

  public ParkingController(ParkingService parkingService) {
    this.parkingService = parkingService;
  }


  @PostMapping(value= "/{id-parking}/assign-spot", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<VehicleDTO> assignSpot(@RequestBody @Valid VehicleDTO vehicleDTO, @PathVariable("id-parking") String idParking) {
      return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ParkingDTO> createParkingLot(@RequestBody @Valid ParkingDTO parkingDTO) {
      parkingService.create(parkingDTO);
    return new ResponseEntity<>(parkingDTO, HttpStatus.OK);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<ParkingDTO>> getParkings() {
    List<ParkingDTO> parkingDTOList = parkingService.getAllParkings();
    return new ResponseEntity<>(parkingDTOList, HttpStatus.OK);
  }
}
