package com.parkingapp.parkingmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SpotDTO {
  @NotBlank(message = "motorcycles cannot be blank")
  private Integer motorcycles;

  @NotBlank(message = "cacrs cannot be blank")
  private Integer cars;

  @NotBlank(message = "buses cannot be blank")
  private Integer buses;
}
