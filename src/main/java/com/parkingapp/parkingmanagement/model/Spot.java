package com.parkingapp.parkingmanagement.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("spot")
@Getter
@Setter
public class Spot {
  @Id
  private String id;
  private Integer motorcycles;
  private Integer cars;
  private Integer buses;
}
