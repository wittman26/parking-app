package com.parkingapp.parkingmanagement.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("parking")
@Getter
@Setter
public class Parking {
  @Id
  private String id;
  private Spot numberSpots;
}
