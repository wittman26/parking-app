package com.parkingapp.parkingmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
public class VehicleDTO {
  @NotBlank(message = "Id  cannot be blank")
  private String id;
  @NotBlank(message = "type cannot be blank")
  private String type;
  @NotNull(message = "timestamp cannot be Null")
  private Instant entryTime;
}
