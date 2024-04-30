package com.parkingapp.parkingmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkingDTO {
  @NotBlank(message = "Id cannot be blank")
  private String id;

  private SpotDTO numberSpots;
}
