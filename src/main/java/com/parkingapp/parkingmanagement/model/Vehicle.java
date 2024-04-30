package com.parkingapp.parkingmanagement.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("vehicle")
@Getter
@Setter
public class Vehicle {
  @Id
  private String id;
  private String type;
  private Instant entryTime;
}
